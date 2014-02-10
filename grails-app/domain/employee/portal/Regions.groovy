package employee.portal

class Regions {

	BigDecimal regionId
	String regionName

	static hasMany = [countrieses: Countries]

	static mapping = {
		id name: "regionId", generator: "assigned"
		version false
	}

	static constraints = {
		regionName nullable: true, maxSize: 25
	}
}
