package com.skillyheads.jetmail.controllers;

import com.skillyheads.jetmail.entities.Employee;
import com.skillyheads.jetmail.models.Mail;
import com.skillyheads.jetmail.models.Post;
import com.skillyheads.jetmail.repository.EmployeeDetail;
import com.skillyheads.jetmail.repository.EmployeeExtendedRepository;
import com.skillyheads.jetmail.repository.EmployeeRepository;
import com.skillyheads.jetmail.repository.rowmappers.EmployeeRowMapper;
import com.skillyheads.jetmail.services.MailChimpSender;
import com.skillyheads.jetmail.services.MailSender;
import com.skillyheads.jetmail.services.ZohoMailAdaptor;
import com.skillyheads.jetmail.services.ZohoMailSender;
import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mails")
public class MailController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeExtendedRepository employeeExtendedRepository;
    @GetMapping({"/",""})
    public String getMails(){
        return "All Mails";
    }
    @GetMapping(value = {"/{id}","/{id}/"}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Mail getMail(@PathVariable("id") String id){
        Mail mail = new Mail();
        mail.setId(id);
        mail.setBody("Default Body");
        return mail;
    }
    @PostMapping("/post")
    public String createPost(@RequestBody List<Post> post){
        Employee emp = employeeRepository.findByEmpName("Krishna");
     return "posted";
    }

    @PostMapping("/emp")
    public void createEmployee(@RequestBody Employee emp){
        employeeRepository.createEmployee(emp);
    }

    @PatchMapping("/emp")
    public void updateEmployee(@RequestBody Employee emp){
        employeeRepository.updateEmpName(emp.getEmpId(), emp.getEmpName());
    }


    @GetMapping("/id")
    public Mail getMailById(@RequestParam("id") String id){
        return new Mail();
    }
    @PostMapping
    public Mail sendMail(@RequestBody  Mail mail){
        System.out.println(mail);
        return mail;
    }
    @GetMapping("/employees")
    public List<String> employees(){
        return employeeRepository.getEmpNames();
    }


    @GetMapping("/employeeDetails")
    public List<EmployeeDetail> employeeDetails(){
        return employeeRepository.getEmployeeDetails();
    }

    @GetMapping(value = "/employee/{id}", produces = {"application/json"})
    public Employee employeeInfo(@PathVariable("id") int id ){
        Employee emp = employeeExtendedRepository.getEmployee(EmployeeExtendedRepository.GET_EMPLOYEE_INFO, new EmployeeRowMapper(), id);
        System.out.println(emp.getEmpId());
        return emp;
    }
}