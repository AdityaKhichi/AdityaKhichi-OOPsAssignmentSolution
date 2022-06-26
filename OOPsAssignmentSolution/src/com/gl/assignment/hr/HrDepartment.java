package com.gl.assignment.hr;

import com.gl.assignment.SuperDepartment;

public class HrDepartment extends SuperDepartment{
	
	private String activity;
	
	
	public HrDepartment() {
		
	}
	
	
    public String departmentName() {
		
		departmentname="Hr Department";
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		work="Fill today's timesheet and mark your attendance";
		return work;
		
	}
	
	public String getWorkDeadline() {
		
		deadline="Complete by EOD";
		return deadline;
		
	}
	
	public String doActivity() {
		
		activity ="team Lunch";
		return activity;
		
	}

	
}
