package com.example.department_service.repository;

import com.example.department_service.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DepartmentRepo extends JpaRepository<Department, String> {
    Page<Department> findAll(Pageable pageable);
}
