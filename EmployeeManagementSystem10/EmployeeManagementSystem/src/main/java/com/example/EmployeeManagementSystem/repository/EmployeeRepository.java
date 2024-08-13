package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeProjection;
import com.example.EmployeeManagementSystem.dto.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Projections
    @Query("SELECT e.id AS id, e.name AS name, e.email AS email FROM Employee e")
    List<EmployeeProjection> findEmployeeProjections();

    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDto(e.id, e.name, e.email) FROM Employee e")
    List<EmployeeDto> findEmployeeDtos();

    // Paginated and sorted query
    Page<Employee> findByDepartmentId(Long departmentId, Pageable pageable);
}
