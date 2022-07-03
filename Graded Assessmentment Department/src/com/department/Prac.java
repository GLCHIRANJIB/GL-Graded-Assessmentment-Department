package com.department;

class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HR_department hr = new HR_department();
		techDepartment td = new techDepartment();
		Admindepartment ad= new Admindepartment();
		
	
	
	    System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getTodaysDeadline());
		System.out.println(ad.isTodayaHoliday());
		System.out.println();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getTodaysDeadline());
		System.out.println(hr.isTodayaHoliday());
		System.out.println();
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getTodaysDeadline());
		System.out.println(td.techStackInformation());
		System.out.println(td.isTodayaHoliday());
		
	
		
		
	}

}
