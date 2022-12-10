package com.springBootTutor.repo;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.springBootTutor.entity.Department;

@Repository
public interface DeptRepo extends JpaRepository<Department, Long>{

}
