package com.BMKCompany.ToolManagementSystem.repository;

import com.BMKCompany.ToolManagementSystem.model.Tool;

import com.BMKCompany.ToolManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository extends JpaRepository <Tool,Long> {



}
