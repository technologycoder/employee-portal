package employee.portal

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class JobHistory implements Serializable {

	Integer employeeId
	Date startDate
	Date endDate
	//Employee employee
	Job job
	Department department

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

	static belongsTo = [Department, Employee, Job]

	static mapping = {
		table 'JOB_HISTORY'
		id composite: ["employeeId", "startDate"]
		startDate sqlType: "date"
		endDate sqlType: "date"
		version false
	}
}
