package com.knoldus.SpringwebApp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="empname")
    private String name;

    public Employee() {
    }

    public Employee(int empId, String empName) {
        this.id = empId;
        this.name = empName;
    }

    public int getEmpId() {
        return id;
    }

    public void setEmpId(int empId) {
        this.id = empId;
    }

    public String getEmpName() {
        return name;
    }

    public void setEmpName(String empName) {
        this.name = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + id +
                ", empName='" + name + '\'' +
                '}';
    }
}
