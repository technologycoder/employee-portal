package employee.portal

class Department {

	Short departmentId
	String departmentName
	Employee manager
	Location location

	static hasMany = [employees: Employee,
	                  jobHistories: JobHistory]
	static belongsTo = [Location]

	static mapping = {
		table 'DEPARTMENTS'
		id name: "departmentId", generator: "assigned"
		manager column: 'manager_id'
		version false
	}

	static constraints = {
		departmentName maxSize: 30
	}
}
