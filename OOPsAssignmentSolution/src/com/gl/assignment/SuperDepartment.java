package com.gl.assignment;

public class SuperDepartment {
	
	protected String departmentname;
	protected String work;
	protected String deadline;
	protected String holiday;
	
	
	public SuperDepartment() {
		
	}
	
	
	public String departmentName() {
		
		departmentname="Super Department";
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		work="No Work as of now";
		return work;
		
	}
	
	public String getWorkDeadline() {
		
		deadline="Nil";
		return deadline;
		
	}
	
	public String isTodayAHoliday() {
		
		holiday = "Today is not a Holiday";
		return holiday;
		
	}


}
