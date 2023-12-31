package com.bhoumik.bhoumikdemo.repository;

import com.bhoumik.bhoumikdemo.model.Employee;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods


}