package ex;

import java.util.Scanner;

abstract class Student {
	protected String name;
	protected int adminNo;

	public Student(String name, int admin_no) {
		this.name = name;
		this.adminNo = admin_no;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.adminNo);
	}

	abstract public int getMark();
}

class PythonStudent extends Student {
	protected int lab_marks;

	public PythonStudent(String name, int admin_no, int theory_mark) {
		super(name, admin_no);
		this.lab_marks = theory_mark;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.lab_marks);
	}

	@Override
	public int getMark() {
		return this.lab_marks;
	}
}

class JavaStudent extends Student {
	protected int theory_marks;

	public JavaStudent(String name, int admin_no, int lab_mark) {
		super(name, admin_no);
		this.theory_marks = lab_mark;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.theory_marks);
	}

	@Override
	public int getMark() {
		return this.theory_marks;
	}
}

class JavaEEStudent extends JavaStudent {
	protected int project_mark;

	public JavaEEStudent(String name, int admin_no, int theory_mark, int project_mark) {
		super(name, admin_no, theory_mark);
		this.project_mark = project_mark;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.project_mark);
	}

	public int getMark() {
		return super.getMark() + this.project_mark;
	}
}

public class TestStudents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course;
		System.out.println("Enter course  :");
		course = scanner.nextLine();

		Student s;

		if (course.equals("python")) {
			s = new PythonStudent("Abc", 1001, 90);
		} else if (course.equals("javase")) {
			s = new JavaStudent("Pqr", 1002, 91);
		} else {
			s = new JavaEEStudent("Xyz", 1003, 92, 93);
		}

		s.print();
		System.out.println(s.getMark());

	}
}
