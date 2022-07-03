package com.department;
import java.util.Scanner;

class SuperDepartment{
	public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No work as of Now";
	}
	public String getTodaysDeadline() {
		return "Nil";
	}
	public String isTodayaHoliday() {
		return "Today is not a Holiday";
	}
}

class Admindepartment extends SuperDepartment{
	public String departmentName() {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "complete your documents submission";
	}
	public String getTodaysDeadline() {
		return "Complete by EOD";
	}
}
class HR_department extends SuperDepartment{
	public String departmentName() {
		return "Welcome to HR Department";
	}
	public String getTodaysWork() {
		return "Fill todays's timesheet and mark your attendance";
	}
	public String getTodaysDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team lunch";
	}
}
class techDepartment extends SuperDepartment{
	public String departmentName() {
		return "Welcome to Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	public String getTodaysDeadline() {
		return "Complete by EOD";
	}
	public String techStackInformation() {
		return "core java";
	}
}

 

