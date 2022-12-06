package com.example.springproject.controller;


import com.example.springproject.entities.Department;
import com.example.springproject.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Department")
public class DepartmentController {

    DepartmentService departmentService;

    @GetMapping("GetAllDeps")
    List<Department> retrieveAllDepartments(){
        return departmentService.retrieveAllDepartments();
    }

    @PostMapping("addDep")
    Department addDepartment(@RequestBody Department c){
        return departmentService.addDepartment(c);
    }

    @DeleteMapping("deleteDep/{id}")
    void deleteDepartment(@PathVariable Integer id){
        departmentService.deleteDepartment(id);
    }

    @PutMapping("updateDep")
    Department updateDepartment(@RequestBody Department c){
        return departmentService.updateDepartment(c);
    }

    @GetMapping("getDep/{id}")
    Department retrieveDepartment(@PathVariable Integer id){
        return departmentService.retrieveDepartment(id);
    }

}



























