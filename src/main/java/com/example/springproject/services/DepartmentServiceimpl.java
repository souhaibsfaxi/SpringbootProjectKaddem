package com.example.springproject.services;


import com.example.springproject.entities.Department;

import com.example.springproject.repositories.DepartmentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceimpl implements DepartmentService{
    DepartmentRepo departmentrepo;

    @Override
    public List<Department> retrieveAllDepartments(){
        return departmentrepo.findAll();
    }

    @Override
    public Department addDepartment(Department c){
        return departmentrepo.save(c);
    }

    @Override
    public void deleteDepartment(Integer id){
        departmentrepo.deleteById(id);
    }

    @Override
    public Department updateDepartment(Department c){
        return departmentrepo.save(c);
    }

    @Override
    public Department retrieveDepartment(Integer id){
        return departmentrepo.findById(id).orElse(null);
    }
}
