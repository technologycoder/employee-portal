package employee.portal

class EmployeeController {

    def index() { 
		list()
	}
	
	def list() {
		
		def employees = Employee.list();
		render(view: "employees", model: [employees: employees])
	}
}
