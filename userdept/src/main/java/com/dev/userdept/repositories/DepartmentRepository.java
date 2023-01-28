package com.dev.userdept.repositories;

import com.dev.userdept.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
