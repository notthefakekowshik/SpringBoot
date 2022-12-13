package com.springBootTutor.service;


import java.util.List;

import com.springBootTutor.entity.Department;
import com.springBootTutor.exceptions.DepartmentNotFoundException;

public interface DeptService {

	Department saveDepartment(Department dept);

	List<Department> fetchDepartmentList();

	Department fetchDepartmentById(Long deptId) throws DepartmentNotFoundException;

	void deleteDeptById(Long deptId) throws DepartmentNotFoundException;

	Department updateDepartment(Long deptId, Department dept);

	Department fetchDepartmentByName(String deptName);

	Department fetchDepartmentIdByName(String name);

}
