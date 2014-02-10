package employee.portal

class Locations {

	Short locationId
	String streetAddress
	String postalCode
	String city
	String stateProvince
	Countries countries

	static hasMany = [departmentses: Departments]
	static belongsTo = [Countries]

	static mapping = {
		id name: "locationId", generator: "assigned"
		version false
	}

	static constraints = {
		streetAddress nullable: true, maxSize: 40
		postalCode nullable: true, maxSize: 12
		city maxSize: 30
		stateProvince nullable: true, maxSize: 25
	}
}
