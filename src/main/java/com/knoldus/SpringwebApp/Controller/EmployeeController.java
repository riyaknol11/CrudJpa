package com.knoldus.SpringwebApp.Controller;

import com.knoldus.SpringwebApp.CustomException.BusinessException;
import com.knoldus.SpringwebApp.CustomException.ControllerException;
import com.knoldus.SpringwebApp.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.knoldus.SpringwebApp.Model.*;

import java.util.List;

@RestController
public class EmployeeController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeService employeeService;
//    @RequestMapping("/")
//    public String employee(){
//        return "employee";
//    }

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        List<Employee> emp = employeeService.fetchAllEmployee();
        return emp;
    }

//    @PostMapping("/employee")
//    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
//
//        try{
//          Employee employee1 = employeeService.saveEmployee(employee);
//          return new ResponseEntity<Employee>(employee1, HttpStatus.CREATED);
//        }
//        catch (BusinessException e){
//            ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
//            return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
//        }
//
//        catch (Exception e){;
//            ControllerException ce = new ControllerException("611", "Something went wrong in controller!");
//            return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
//        }
//        // The @RequestBody annotation tells Spring to deserialize an incoming request body into
//        // an object passed as a parameter to the handler method.
//
//    }

    @PostMapping("/employee")

    public Employee saveEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee
    updateEmployee(@RequestBody Employee employee, @PathVariable("id") int empId)
    {
        return employeeService.updateEmployee(employee, empId);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteDepartmentById(@PathVariable("id") int empId)
    {
        employeeService.deleteEmployeeById(empId);

        return "Deleted Successfully";
    }

    @GetMapping("/checkingPostMan")
    public String get(){

        return "Postman is working";
    }


    @GetMapping("/employee/{id}")
    public Employee fetchEmployeeDetailsById(@PathVariable("id") int empId){
     return employeeService.fetchEmployeeById(empId);
    }

//    @RequestMapping("/addEmployee")
//    public String showEmployee(Employee employee){
//        employeeRepository.save(employee);
//        return "employee";
//    }
}
