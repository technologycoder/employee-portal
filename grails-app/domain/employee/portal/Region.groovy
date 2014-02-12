package employee.portal

class Region {	
	
	String regionName	

	static hasMany = [countries: Country]

	static mapping = {
		version false
		table 'REGIONS'
		id column: "REGION_ID", sqlType: 'number'
		id generator: "assigned"
	}

	static constraints = {
		regionName nullable: true, maxSize: 25
	}
}
