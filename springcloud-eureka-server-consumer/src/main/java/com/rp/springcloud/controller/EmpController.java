package com.rp.springcloud.controller;

import com.rp.springcloud.bean.Employee;
import com.rp.springcloud.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private IEmpService empService;

    @GetMapping("getEmp/{id}")
    public Employee getEmployerById(@PathVariable("id") int id){
        Employee employee = empService.getEmployee(id);
        return employee;
    }
}