package com.knoldus.SpringwebApp.Service;

import com.knoldus.SpringwebApp.CustomException.BusinessException;
import com.knoldus.SpringwebApp.CustomException.EmployeeNotFound;
import com.knoldus.SpringwebApp.Dao.EmployeeRepository;
import com.knoldus.SpringwebApp.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployee() {
//        List<Employee> employeeCompleteList = new ArrayList<>();
//        employeeRepository.findAll()
//                .forEach(employeeCompleteList::add);
//        return employeeCompleteList;
        List<Employee> empList = employeeRepository.findAll();
        return empList;


    }

    @Override
    public Employee fetchEmployeeById(int empId) {
        return employeeRepository.findById(empId).orElseThrow(() -> new EmployeeNotFound("Employee not found with id " + empId));

    }


    @Override
    public Employee updateEmployee(Employee employee, int empId) {
    Employee newEmp = null;
        if (employee.getEmpName() != null && !employee.getEmpName().equals("")){
            newEmp = employeeRepository.save(employee);
        }
    return newEmp;
    }



    @Override
    public void deleteEmployeeById(int empId) {
        try{
            employeeRepository.deleteById(empId);
        }
         catch (NoSuchElementException e){
            throw new BusinessException("608", "No id given, don't send the blank id!");
         }
    }

}
