package com.springBootTutor.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootTutor.entity.Department;
import com.springBootTutor.repo.DeptRepo;
import com.springBootTutor.exceptions.*;
@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptRepo Dr;

	@Override
	public Department saveDepartment(Department dept) 
	{
		//dept anedi obj of type department, idi manam postman lo istam as JSON format.
		// TODO Auto-generated method stub
		return Dr.save(dept);
	}

	@Override
	public List<Department> fetchDepartmentList() 
	{
		return Dr.findAll();	
	}

	@Override
	public Department fetchDepartmentById(Long deptId) throws DepartmentNotFoundException 
	{
		Optional<Department> ansDept = Dr.findById(deptId);
		if(!ansDept.isPresent())
		{
			throw new DepartmentNotFoundException("Department not found!");
		}
		return ansDept.get();
	}

	@Override
	public void deleteDeptById(Long deptId) throws DepartmentNotFoundException 
	{
		Optional<Department> ansDept = Dr.findById(deptId);
		if(!ansDept.isPresent())
		{
			throw new DepartmentNotFoundException("Department not found!");
		}
		Dr.deleteById(deptId);
	}
	
	@Override
	public Department updateDepartment(Long deptId, Department dept) 
	{
		//dept anedi obj of type department, idi manam postman lo istam as JSON format.
		Department ans = null;
		try
		{
			Department deptFromDb = Dr.findById(deptId).get();
			
			deptFromDb.setDeptName(dept.getDeptName()); //ee step important, what does this mean? try to think
			//aa dept anedi json kada, DB lo unna column values JSON lo ivakpote null ostundi, apdu if condition oakti petkoni cheyali which you've done many a time while doing DSA.
			
			ans = Dr.save(deptFromDb);
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		return ans;
	}

	@Override
	public Department fetchDepartmentByName(String deptName) 
	{
		return Dr.findBydeptName(deptName); //cant get duplicate values
//		return Dr.findBydeptNameIgnoreCase(deptName);
	}

	@Override
	public Department fetchDepartmentIdByName(String name) 
	{
		Department databaseObj = Dr.findBydeptName(name); //cant get duplicate values
		return databaseObj;
	}	
}
