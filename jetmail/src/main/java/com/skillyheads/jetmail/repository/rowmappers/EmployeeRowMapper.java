package com.skillyheads.jetmail.repository.rowmappers;

import com.skillyheads.jetmail.entities.Address;
import com.skillyheads.jetmail.entities.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        int empId= rs.getInt("emp_id");
        String empName = rs.getString("emp_name");
        int addressId = rs.getInt("address_id");
        String alias = rs.getString("alias");
        String houseNo = rs.getString("house_no");
        String streetName = rs.getString("street_name");
        String pincode = rs.getString("pincode");

        Address address =  new Address(addressId, alias, houseNo, streetName, pincode);
        Employee emp = new Employee(empId, empName, address);

        return emp;
    }
}
