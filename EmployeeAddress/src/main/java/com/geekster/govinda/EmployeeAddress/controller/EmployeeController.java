package com.geekster.govinda.EmployeeAddress.controller;

import com.geekster.govinda.EmployeeAddress.model.Employee;
import com.geekster.govinda.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String SaveEmployee(@RequestBody List<Employee> employeeList){

        return employeeService.saveAllEmployee(employeeList);
    }

    //find by id


    @GetMapping("/Employee/{id}")
    public Optional<Employee> getById(@PathVariable Long id){
        return employeeService.findById(id);


    }
    // get All employee

    @GetMapping("/allEmployee")

    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @DeleteMapping("/deleteById/{id}")

    public String  deleteById(@PathVariable Long id){
        employeeService.deleteById(id);

        return "Employee deleted SuccessFully";
    }
    @PutMapping("/employee/{id}")

    public String updateEmployeeDetails(@PathVariable Long id,@RequestBody Employee employee){

        return employeeService.updateUsingId(id,employee);

    }




}
