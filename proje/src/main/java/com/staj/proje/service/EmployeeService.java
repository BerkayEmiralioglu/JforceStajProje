package com.staj.proje.service;

import com.staj.proje.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(Long id);

    void deleteById(Long ids);
}