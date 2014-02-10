package employee.portal

class Department {

	Short departmentId
	String departmentName
	Employee employees
	Location locations

	static hasMany = [employeeses: Employee,
	                  jobHistories: JobHistory]
	static belongsTo = [Employee, Location]

	static mapping = {
		id name: "departmentId", generator: "assigned"
		version false
	}

	static constraints = {
		departmentName maxSize: 30
	}
}
