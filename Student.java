package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Name of the Student");
		}
	public void studentDept()
	{
		System.out.println("Department of the Student");
		}
	public void studentId()
	{
		System.out.println("ID of the Student");
		}
	public static void main(String[] args) {
		Student objstd = new Student();
		objstd.collegeCode();
		objstd.collegeName();
		objstd.collegeRank();
		objstd.deptName();
		objstd.studentDept();
		objstd.studentId();
		objstd.studentName();
	}
	
}
