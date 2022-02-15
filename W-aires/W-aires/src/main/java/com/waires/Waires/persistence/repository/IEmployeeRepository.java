package com.waires.Waires.persistence.repository;

import com.waires.Waires.persistence.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> {
}
