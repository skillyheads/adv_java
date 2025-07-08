package com.skillyheads.jetmail.repository.impl;

import com.skillyheads.jetmail.entities.Employee;
import com.skillyheads.jetmail.repository.EmployeeExtendedRepository;
import com.skillyheads.jetmail.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;


public class EmployeeRepositoryImpl implements EmployeeExtendedRepository{
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Override
    public Employee getEmployee(String query, RowMapper<Employee> employeeRowMapper, int empId) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("empId", empId);
        return jdbcTemplate.queryForObject(query,parameters,employeeRowMapper);

    }
}
