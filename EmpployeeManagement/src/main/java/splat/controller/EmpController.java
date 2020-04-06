package splat.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import splat.model.Employee;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(path = "/employees")
public class EmpController {

	@GetMapping(path = "/", produces = "application/json")
	public Employee getAllEmployees() {
		Employee emp1 = new Employee();
		emp1.setFirstName("Jhon");
		emp1.setLastName("David");
		return emp1;
	}
}
