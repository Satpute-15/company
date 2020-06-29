package com.example.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.company.model.Department;
import com.example.company.model.Employee;
import com.example.company.repository.DepartmentRepository;
import com.example.company.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	public Employee addEmployee(Employee employee) {
		 
        Department dept = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
        if (null == dept) {
            dept = new Department();
        }
        dept.setDeptName(employee.getDepartment().getDeptName());
        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }
	public Employee editEmployees(Employee entity) {
		 
        return employeeRepository.save(entity);
    }
	 public void deleteEmployees(Integer id) {
		 
	        employeeRepository.deleteById(id);
	    }
}
