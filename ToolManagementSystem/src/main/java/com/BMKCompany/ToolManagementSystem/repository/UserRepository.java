package com.BMKCompany.ToolManagementSystem.repository;

import com.BMKCompany.ToolManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
