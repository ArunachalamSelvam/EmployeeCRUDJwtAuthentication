package com.arun.controller;
import com.arun.model.Employee;
import com.arun.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = {RequestMethod.POST}, value = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        if(employeeService.addEmployee(employee)) {
        	return employee.getEmployeeId()+" is added successfully.";
        }
        
        return "Employee could not be added.";
        
    }

    @RequestMapping(method = {RequestMethod.GET}, value = "/getEmployees")                                      // mapping the route "/todos" to getTodos
    public List<Employee> getEmployee() {              // The argument is basically a Model that we are going to return back to the view after adding our own things to it
        return employeeService.listEmployee();
    }
    
    @RequestMapping(method = {RequestMethod.POST}, value = "/updateEmployee/{employeeId}")
	public String updateEmployee(@PathVariable(value = "employeeId") long id, @RequestBody Employee employee) {
		String message = employeeService.updateEmployee(id,employee);
		
		return message;
		
	}
	
    @RequestMapping(method = {RequestMethod.DELETE}, value = "/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable(value = "employeeId") long id) {
		
		String message = employeeService.deleteEmployee(id);
		
		return message;
	}


}
