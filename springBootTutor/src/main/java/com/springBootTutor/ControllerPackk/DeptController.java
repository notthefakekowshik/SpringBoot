package com.springBootTutor.ControllerPackk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springBootTutor.entity.Department;
import com.springBootTutor.service.DeptService;




@RestController
public class DeptController 
{
	
	@Autowired
	private DeptService Ds; 
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department dept)
	{
		return Ds.saveDepartment(dept);
	}
	
	@GetMapping("/getDepartment")
	public List<Department> fetchDeptList()
	{
		return Ds.fetchDepartmentList();
	}
	
	@GetMapping("/getDepartment/{id}")
	public Department getDeptById(@PathVariable("id") Long deptId)
	{
		return Ds.fetchDepartmentById(deptId);
	}
	
	@DeleteMapping("/deleteDepartment/{id}")
	public String deleteDeptById(@PathVariable("id") Long deptId)
	{
		Ds.deleteDeptById(deptId);
		return "Dept ID deleted";
	}
	
	@PutMapping("/updateDepartment/{id}")
	public Department updateDepartment(@PathVariable("id") Long deptId , @RequestBody Department dept)
	{
		return Ds.updateDepartment(deptId,dept);
	}
}


//ila different methods ki different urls kakunda, same url kooda ivochu
 
//for example :
/*
@GetMapping("/getDepartment/{id}")
@DeleteMapping("/getDepartment/{id}")
@PutMapping("/getDepartment/{id}")
*/