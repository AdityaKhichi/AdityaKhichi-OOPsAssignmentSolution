package com.gl.assignment.tech;

import com.gl.assignment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	private String stackinfo;
	
	
	public TechDepartment() {
		
	}
	
	
    public String departmentName() {
		
		departmentname="Tech Department";
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		work="Complete coding of Module 1";
		return work;
		
	}
	
	public String getWorkDeadline() {
		
		deadline="Complete by EOD";
		return deadline;
		
	}
	
	public String getTechStackInformation() {
		
		stackinfo="Core Java";
		return stackinfo;
		
	}

	
}
