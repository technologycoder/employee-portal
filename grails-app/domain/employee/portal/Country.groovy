package employee.portal

class Country {

	String id
	String countryName
	Region region

	static hasMany = [locations: Location]
	static belongsTo = [Region]

	static mapping = {
		version false
		table 'COUNTRIES'
		id column: "COUNTRY_ID", sqlType: "char", length: 2
		id generator: "assigned"
	}

	static constraints = {
		id maxSize: 2
		countryName nullable: true, maxSize: 40
	}
}
