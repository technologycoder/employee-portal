package employee.portal



import spock.lang.*

/**
 *
 */
class CountryIntegrationSpec extends Specification {   

     def "Saving Country to the database"() {

        given: "A new country"				
		def testCountry = new Country(countryName: 'test country')		
		testCountry.id = 'TC'
		testCountry.region = Region.get(1);				
		
        when: "the country is saved"
		//exception will be thrown if there is validation failure
        testCountry.save(failOnError : true)

        then: "it saved successfully and can be found in the database"
        //testCountry.errors.errorCount == 0        
        Country.get(testCountry.id).countryName == testCountry.countryName	   		

    }
}
