package com.skillyheads.jetmail.repository;

import com.skillyheads.jetmail.entities.Employee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeExtendedRepository{
    public static final String GET_EMPLOYEE_INFO="SELECT * FROM EMPLOYEE INNER JOIN ADDRESS ON EMPLOYEE.ADDRESS_ID = ADDRESS.ADDRESS_ID WHERE EMP_ID = :empId";
    Employee getEmployee(String query, RowMapper<Employee> employeeRowMapper, int empId);
}
