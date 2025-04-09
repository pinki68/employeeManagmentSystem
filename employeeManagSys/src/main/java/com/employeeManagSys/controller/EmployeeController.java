package com.employeeManagSys.controller;

import jakarta.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.employeeManagSys.model.Employee;

import com.employeeManagSys.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequestMapping("/employees")
@Tag(name = "Employee API", description = "Add, Update, Delete Employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public String listEmployees(Model model) {
		model.addAttribute("employees", service.getAllEmployees());
		return "employees";
	}

	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "add-employee";
	}

	@PostMapping("/save")
	public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-employee";
		}
		service.saveEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", service.getEmployeeById(id));
		return "edit-employee";
	}

	@PostMapping("/update/{id}")
	public String updateEmployee(@PathVariable Long id, @Valid @ModelAttribute Employee employee,
			BindingResult result) {
		if (result.hasErrors()) {
			return "edit-employee";
		} else {
			employee.setId(id);
			service.saveEmployee(employee);
			return "redirect:/employees";
		}
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return "redirect:/employees";
	}
}
