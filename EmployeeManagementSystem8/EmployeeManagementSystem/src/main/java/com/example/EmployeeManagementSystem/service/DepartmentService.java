package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.dto.DepartmentDto;
import com.example.EmployeeManagementSystem.projection.DepartmentProjection;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    

    public List<DepartmentProjection> getDepartmentProjections() {
        return departmentRepository.findDepartmentProjections();
    }

    public List<DepartmentDto> getDepartmentDtos() {
        return departmentRepository.findDepartmentDtos();
    }
}
