package com.knoldus.SpringwebApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.knoldus.SpringwebApp.Model.*;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
