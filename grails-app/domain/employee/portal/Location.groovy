package employee.portal

class Location {

	Short locationId
	String streetAddress
	String postalCode
	String city
	String stateProvince
	Country country

	static hasMany = [departments: Department]
	static belongsTo = [Country]

	static mapping = {
		table 'LOCATIONS'
		id name: "locationId", generator: "assigned"
		country column: "COUNTRY_ID", sqlType: "char", length: 2
		version false
	}

	static constraints = {
		streetAddress nullable: true, maxSize: 40
		postalCode nullable: true, maxSize: 12
		city maxSize: 30
		stateProvince nullable: true, maxSize: 25
	}
}
