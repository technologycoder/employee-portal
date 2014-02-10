package employee.portal

class Employee {

	String firstName
	String lastName
	String email
	String phoneNumber
	Date hireDate
	BigDecimal salary
	BigDecimal commissionPct
	Job job
	Department department
	Employee manager

	static hasMany = [employees: Employee,
	                  jobHistories: JobHistory]
	static belongsTo = [Department, Job]

	static mapping = {
		table 'EMPLOYEES'
		id column: "EMPLOYEE_ID", generator: "assigned"
		hireDate sqlType: "date"
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
