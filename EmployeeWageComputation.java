package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
//Welcome message for Employee wage computation problems
	public static void main(String[] args) {
		System.out.println("Welcome message for Employee wage computation problems");
//Check Employee is Present or Absent
// Calculate DailyEmployee Wage
// Assume Wage per Hour is 20
// Assume Full Day Hour is 8
		int WageperHour = 20;
		int FullDayHour = 8;
		double num = Math.random();
		System.out.println(num);

		int randomCheck = ((int) (num * 10)) % 2;
		System.out.println("Random check value:" + randomCheck);
		if (randomCheck == 1) {
			System.out.println("employee is present");
			int employeewage = WageperHour * FullDayHour;
			System.out.println("employee wage is:" + employeewage);
		} else if (randomCheck == 0) {
			System.out.println("employee is absent");
		}
	}
}