package com.scaspb.pp_2_3_1_html.dao;

import com.scaspb.pp_2_3_1_html.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployees(int id);

    public void deleteEmployee(int id);
}
