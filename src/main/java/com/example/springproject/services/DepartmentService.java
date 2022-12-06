package com.example.springproject.services;

import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> retrieveAllDepartments();

    Department addDepartment(Department c);

    void deleteDepartment(Integer id);

    Department updateDepartment(Department c);

    Department retrieveDepartment(Integer id);
}
