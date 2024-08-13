package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.projection.DepartmentProjection;
import com.example.EmployeeManagementSystem.dto.DepartmentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Projections
    @Query("SELECT d.id AS id, d.name AS name FROM Department d")
    List<DepartmentProjection> findDepartmentProjections();

    @Query("SELECT new com.example.EmployeeManagementSystem.dto.DepartmentDto(d.id, d.name) FROM Department d")
    List<DepartmentDto> findDepartmentDtos();
}
