package employee.portal

class Departments {

	Short departmentId
	String departmentName
	Employees employees
	Locations locations

	static hasMany = [employeeses: Employees,
	                  jobHistories: JobHistory]
	static belongsTo = [Employees, Locations]

	static mapping = {
		id name: "departmentId", generator: "assigned"
		version false
	}

	static constraints = {
		departmentName maxSize: 30
	}
}
