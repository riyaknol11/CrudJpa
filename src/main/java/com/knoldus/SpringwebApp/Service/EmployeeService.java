package com.knoldus.SpringwebApp.Service;

import com.knoldus.SpringwebApp.Model.Employee;

import java.util.List;

public interface EmployeeService{

    Employee saveEmployee(Employee employee);

    List<Employee> fetchAllEmployee();

    Employee fetchEmployeeById(int empId);

    Employee updateEmployee(Employee employee, int empId);

    void deleteEmployeeById(int departmentId);

}
