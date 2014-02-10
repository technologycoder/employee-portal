package employee.portal

class Employees {

	String firstName
	String lastName
	String email
	String phoneNumber
	Date hireDate
	BigDecimal salary
	BigDecimal commissionPct
	Jobs jobs
	Departments departments
	Employees employees

	static hasMany = [departmentses: Departments,
	                  employeeses: Employees,
	                  jobHistories: JobHistory]
	static belongsTo = [Departments, Jobs]

	static mapping = {
		id column: "EMPLOYEE_ID", generator: "assigned"
		version false
	}

	static constraints = {
		firstName nullable: true, maxSize: 20
		lastName maxSize: 25
		email maxSize: 25, unique: true
		phoneNumber nullable: true, maxSize: 20
		salary nullable: true
		commissionPct nullable: true
	}
}
