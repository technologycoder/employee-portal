package employee.portal

class Country {

	String countryId
	String countryName
	Region regions

	static hasMany = [locationses: Location]
	static belongsTo = [Region]

	static mapping = {
		id name: "countryId", generator: "assigned"
		version false
	}

	static constraints = {
		countryId maxSize: 2
		countryName nullable: true, maxSize: 40
	}
}
