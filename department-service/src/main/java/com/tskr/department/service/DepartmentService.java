package com.tskr.department.service;

import com.tskr.department.entity.Department;
import com.tskr.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("Department is Saved with name : {} ",department.getDepartmentName());
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(long departmentId){
        log.info("fetching the department Id {}",departmentId);
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
