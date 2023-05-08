package com.geekster.govinda.EmployeeAddress.repository;

import com.geekster.govinda.EmployeeAddress.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface IEmployeeRepository extends CrudRepository<Employee,Long> {
    // finder

    public Optional<Employee> findById(Long id);

    public void deleteById(Long id);

}
