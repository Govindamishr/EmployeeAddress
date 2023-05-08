package com.geekster.govinda.EmployeeAddress.service;

import com.geekster.govinda.EmployeeAddress.model.Employee;
import com.geekster.govinda.EmployeeAddress.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;


    public String saveAllEmployee(List<Employee> employeeList) {
        Iterable<Employee> allList = iEmployeeRepository.saveAll(employeeList);
        if (allList == null) {
            return "Employees cannot be added";
        }
        return "Employees Added SuccessFully";
    }

    public Optional<Employee> findById(Long id) {
        return iEmployeeRepository.findById(id);
    }

    public Iterable<Employee> getAll() {
        return iEmployeeRepository.findAll();
    }

    public void deleteById(Long id) {
        iEmployeeRepository.deleteById(id);
    }

    public String updateUsingId(Long id, Employee employee) {
        Optional<Employee> employeeList =iEmployeeRepository.findById(id);
        employee.setId(id);
        if (employeeList.isEmpty()) {
            return "Employee with employee Id: " + id + " not found";
        }
        else  {
            iEmployeeRepository.save(employee);
            return "Employee with employee Id: " + id + " updated successfully";
        }
    }
}

