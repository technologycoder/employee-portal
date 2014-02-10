package employee.portal

class Countries {

	String countryId
	String countryName
	Regions regions

	static hasMany = [locationses: Locations]
	static belongsTo = [Regions]

	static mapping = {
		id name: "countryId", generator: "assigned"
		version false
	}

	static constraints = {
		countryId maxSize: 2
		countryName nullable: true, maxSize: 40
	}
}
