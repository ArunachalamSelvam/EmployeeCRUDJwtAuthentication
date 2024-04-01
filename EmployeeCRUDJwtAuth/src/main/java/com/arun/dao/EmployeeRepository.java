package com.arun.dao;

import com.arun.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {        // Since it is a generic, we are passing the type (Todo) and the ID type (which is long)
    // We are just providing the interface, Spring will provide us with the implementation

    // if we want some special operations which are not there in CrudRepository, then we can include it here

    public Optional<Employee> findById(Long id);
}