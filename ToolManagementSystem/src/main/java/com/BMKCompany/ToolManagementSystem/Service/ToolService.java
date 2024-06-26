package com.BMKCompany.ToolManagementSystem.Service;

import com.BMKCompany.ToolManagementSystem.model.Tool;
import com.BMKCompany.ToolManagementSystem.repository.ToolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolService {

    @Autowired
    private ToolRepo toolRepo;

    public Tool saveTool(Tool tool)
    {
        return toolRepo.save(tool);
    }

    //Implement methods in the service class to save tools, allocate tools, and update the quantity values accordingly.

}
