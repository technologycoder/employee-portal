package employee.portal

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class JobHistory implements Serializable {

	Integer employeeId
	Date startDate
	Date endDate
	Employees employees
	Jobs jobs
	Departments departments

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append employeeId
		builder.append startDate
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append employeeId, other.employeeId
		builder.append startDate, other.startDate
		builder.isEquals()
	}

	static belongsTo = [Departments, Employees, Jobs]

	static mapping = {
		id composite: ["employeeId", "startDate"]
		version false
	}
}