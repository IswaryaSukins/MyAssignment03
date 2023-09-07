package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName(String Name) {
		System.out.println("Student Name is:"+Name);
	}
	public void studentDept(String dept) {
		System.out.println("Student dept is: "+dept);

	}	
	public void studentId(int id) {
		System.out.println("Student id is: "+id);

}
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode(256);
		st.collegeName("Vins College");
		st.collegeRank(1);
		st.deptName("Eng");
		st.studentDept("ECE");
		st.studentId(25);
		st.studentName("Iswarya");
	}
}
