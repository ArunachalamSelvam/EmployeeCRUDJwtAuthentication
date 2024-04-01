package com.arun.service;
import com.arun.dao.EmployeeRepository;
import com.arun.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public boolean addEmployee(Employee employee){
    	
        Employee emp = employeeRepository.save(employee);
        if(emp!=null) {
        	return true;
        }
        return false;
    }


    public List<Employee> listEmployee() {
        List<Employee> allEmployee = new ArrayList<>();
        employeeRepository.findAll().forEach(allEmployee::add);
        return allEmployee;
    }
    

    public String updateEmployee(long id, Employee emp) {
		emp.setEmployeeId(id);
		
		if(employeeRepository.existsById(id)) {
	
			
			employeeRepository.save(emp);
			
			return  emp.getEmployeeId()+" Updated Succefully.";
			
		}
		
		else {
			return "employee not found/ cannot be updated.";
		}
		
	}

    public String deleteEmployee(long id) {
		
		if(employeeRepository.existsById(id)) {
			Optional<Employee> optionalEmployee = employeeRepository.findById(id);
			Employee employee = optionalEmployee.get();
			employeeRepository.deleteById(id);
			
			return id+" deleted successfully.";
			
		}
		
		return "employee not found/ cannot be deleted.";
	}



}
