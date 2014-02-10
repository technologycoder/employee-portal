package employee.portal

class Jobs {

	String jobId
	String jobTitle
	Integer minSalary
	Integer maxSalary

	static hasMany = [employeeses: Employees,
	                  jobHistories: JobHistory]

	static mapping = {
		id name: "jobId", generator: "assigned"
		version false
	}

	static constraints = {
		jobId maxSize: 10
		jobTitle maxSize: 35
		minSalary nullable: true
		maxSalary nullable: true
	}
}
