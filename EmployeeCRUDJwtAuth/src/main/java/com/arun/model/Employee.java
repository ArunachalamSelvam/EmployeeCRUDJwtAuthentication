package com.arun.model;


import javax.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {

    @Id                             
    @GeneratedValue(strategy = GenerationType.AUTO)     
    private long employeeId;

    private String employeeName;
    private String employeeEmail;
    
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "contact_number", length = 12)
    private String contactNumber;

    @Column(name = "native_Location")
    private String location;
    
    @Column(name = "department")
    private String department;
    
    @Column(name = "role")
    private String role;

    @Column(name = "salary")
    private double salary;


    public Employee() {             
    	
    }

    

    public Employee(String employeeName, String employeeEmail, String dateOfBirth, String gender, String contactNumber,
			String location, String department, String role, double salary) {
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.location = location;
		this.department = department;
		this.role = role;
		this.salary = salary;
	}



	public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long id) {
        this.employeeId = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



}