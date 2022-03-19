package com.teletearbies.roskildedaycare.repository;

import com.teletearbies.roskildedaycare.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
