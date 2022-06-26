package com.gl.assignment.admin;

import com.gl.assignment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	
	public AdminDepartment() {
		
	}
	
	
    public String departmentName() {
		
		departmentname="Admin Department";
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		work="Complete your documents submission";
		return work;
		
	}
	
	public String getWorkDeadline() {
		
		deadline="Complete by EOD";
		return deadline;
		
	}

	
}
