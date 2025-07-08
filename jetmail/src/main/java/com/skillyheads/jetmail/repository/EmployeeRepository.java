package com.skillyheads.jetmail.repository;

import com.skillyheads.jetmail.entities.Employee;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.tree.RowMapper;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    @Query("SELECT empName FROM EMPLOYEE")
    List<String> getEmpNames();
    @Query("SELECT empName FROM EMPLOYEE")
    List<EmployeeDetail> getEmployeeDetails();
    Employee findByEmpName(String empName);
    @Modifying
    @Query("INSERT INTO EMPLOYEE (empId, empName) VALUES (:#{#emp.empId}, :#{#emp.empName})")
    void createEmployee(Employee emp);
    @Modifying
    @Query("INSERT INTO EMPLOYEE (empId, empName) VALUES(:empId, :empName)")
    void createEmployee(int empId, String empName);
    @Modifying
    @Query("UPDATE EMPLOYEE SET empName=:empName WHERE EMPLOYEE.empId=:empId")
    void updateEmpName(int empId, String empName);

}
//
//CREATE TABLE EMPLOYEE(
//        empId integer PRIMARY KEY,
//        empName varchar(64)
//);
//
//SELECT * FROM EMPLOYEE;