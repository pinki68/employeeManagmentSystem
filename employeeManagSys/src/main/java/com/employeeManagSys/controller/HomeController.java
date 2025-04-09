package com.employeeManagSys.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employeeManagSys.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class HomeController {

	private final EmployeeService employeeService;

	public HomeController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public String home(Model model) {

		// Add some statistics for the dashboard
		model.addAttribute("totalEmpoyees", employeeService.getAllEmployees().size());

		return "employees";

	}

}
