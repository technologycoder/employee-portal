package employee.portal

class Region {

	BigDecimal regionId
	String regionName

	static hasMany = [countries: Country]

	static mapping = {
		table 'REGIONS'
		id name: "regionId", generator: "assigned"
		version false
	}

	static constraints = {
		regionName nullable: true, maxSize: 25
	}
}
