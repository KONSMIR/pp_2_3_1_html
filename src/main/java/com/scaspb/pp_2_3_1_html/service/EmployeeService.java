package com.scaspb.pp_2_3_1_html.service;

import com.scaspb.pp_2_3_1_html.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
