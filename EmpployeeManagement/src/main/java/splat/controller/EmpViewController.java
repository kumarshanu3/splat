package splat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpViewController {
	
	@GetMapping("/EmpHome")
	public String getEmpHomePage() {
		return "empmain";
	}

}
