package com.UST.departmentservice.service;

import com.UST.departmentservice.entity.Department;
import com.UST.departmentservice.repository.DepartmentRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;


    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
