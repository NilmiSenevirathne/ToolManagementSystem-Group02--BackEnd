package com.BMKCompany.ToolManagementSystem.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Tool")
public class Tool {

    @Id
    private String toolId;
    private String toolName;
    private String description;
    private int quantity;
    private int allocatedTool;
    private int availableTool;


    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public String getToolName() {

        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAllocatedTool() {
        return allocatedTool;
    }

    public void setAllocatedTool(int allocatedTool) {
        this.allocatedTool = allocatedTool;

    }

    public int getAvailableTool() {
        return availableTool;
    }

    public void setAvailableTool(int availableTool) {
        this.availableTool = availableTool;
    }
}