package employee.portal

class Region {

	BigDecimal regionId
	String regionName

	static hasMany = [countrieses: Country]

	static mapping = {
		id name: "regionId", generator: "assigned"
		version false
	}

	static constraints = {
		regionName nullable: true, maxSize: 25
	}
}
