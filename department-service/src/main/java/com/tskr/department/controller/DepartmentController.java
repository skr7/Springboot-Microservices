package com.tskr.department.controller;

import com.tskr.department.entity.Department;
import com.tskr.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;



    @PostMapping("/add")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        Department department1=departmentService.saveDepartment(department);
        return  new ResponseEntity<>(department1,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        Department department= departmentService.findDepartmentById(departmentId);
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }

}
