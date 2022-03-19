package com.teletearbies.roskildedaycare.service;

import com.teletearbies.roskildedaycare.entity.Employee;
import com.teletearbies.roskildedaycare.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

}
