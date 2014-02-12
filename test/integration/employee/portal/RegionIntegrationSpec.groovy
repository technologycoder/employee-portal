package employee.portal



import spock.lang.*

/**
 *
 */
class RegionIntegrationSpec extends Specification {

	def "Saving Region to the database"() {

		given: "A new region"
			def regionList = Region.list(max:1, sort:'id', order:'desc')
			regionList.size()  == 1
			def testRegion = new Region(regionName: 'test region')
			testRegion.id = regionList[0].id + 1

		when: "the region is saved"
			testRegion.save()

		then: "it saved successfully and can be found in the database"
			!testRegion.hasErrors()
			testRegion.errors.errorCount == 0
			Region.get(testRegion.id).regionName == testRegion.regionName
	}

	def "Saving a Region instance which fails Validation"() {

		given: "A region with invalid name"
			def regionList = Region.list(max:1, sort:'id', order:'desc')
			regionList.size()  == 1
			def testRegion = new Region(regionName: 'test region - more than 25')
			testRegion.id = regionList[0].id + 1

		when: "the region is validated"
			testRegion.validate()

		then: 
			testRegion.hasErrors()		
			testRegion.errors.errorCount != 0		
			
			"maxSize.exceeded" == testRegion.errors.getFieldError("regionName").code		
	}
	
	def "Fixing validation errors so that save is successful"() {
		
		given: "A region with invalid name and we try saving it"
			def regionList = Region.list(max:1, sort:'id', order:'desc')
			regionList.size()  == 1
			def testRegion = new Region(regionName: 'test region - more than 25')
			testRegion.id = regionList[0].id + 1
			assert testRegion.save() == null
			assert testRegion.hasErrors()
			
		when: "we fix the invalid property and try save again"
			testRegion.regionName = "test region"
			testRegion.save()
			
		then: "the region saves successfully"
			!testRegion.hasErrors()
			testRegion.errors.errorCount == 0
			Region.get(testRegion.id).regionName == testRegion.regionName
			
	}
	
	
}

