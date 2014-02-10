package employee.portal

class Country {

	String countryId
	String countryName
	Region region

	static hasMany = [locations: Location]
	static belongsTo = [Region]

	static mapping = {
		table 'COUNTRIES'
		countryId column: "COUNTRY_ID", sqlType: "char", length: 2
		id name: "countryId", generator: "assigned"
		version false
	}

	static constraints = {
		countryId maxSize: 2
		countryName nullable: true, maxSize: 40
	}
}
