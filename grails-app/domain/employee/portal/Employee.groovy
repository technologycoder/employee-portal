package employee.portal

class Employee {

	String firstName
	String lastName
	String email
	String phoneNumber
	Date hireDate
	BigDecimal salary
	BigDecimal commissionPct
	Job jobs
	Department departments
	Employee employees

	static hasMany = [departmentses: Department,
	                  employeeses: Employee,
	                  jobHistories: JobHistory]
	static belongsTo = [Department, Job]

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
