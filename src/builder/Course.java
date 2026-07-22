package builder;

import java.util.ArrayList;
import java.util.List;

import factory.Student;
import factory.Professor;
import state.IState;

public class Course {
	private String department;
	private String subject;
	private int courseNum;
	private String name;
	private String location;
	private int roomNum;
	private String day;
	private String time;
	private Professor professor;
	private List<Student> students;
	private int credit;
	private int capacity;
	private IState state;
	
	public Course() {
		this.students = new ArrayList<Student>();
		// this.state = OpenClassState(this);
	}
	
	// can add more getter methods later
	
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;	
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setState(IState state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
	    return String.format(
	        "%-10s %-8s %-25s %-10s%n" +
	        "%-10s %-8d %-25s %-10d%n%n" +
	        "%-12s %-22s %-25s %-20s%n" +
	        "%-12s %-22s %-25s %-20s",
	        "Status", "Units", "Class Name", "Capacity",
	        state, credit, name, capacity,
	        "Class", "Days and Times", "Room", "Professor",
	        subject + " " + courseNum,
	        day + " " + time,
	        location + " " + roomNum,
	        professor
	    );
	}
	
//	public static void main(String args[]) {
//		Course course = new Course();
//		course.department = "Computer Science";
//		course.subject = "CSC";
//		course.courseNum = 453;
//		course.name = "Database";
//		course.location = "CDM Center";
//		course.roomNum = 220;
//		course.Day = "Wed";
//		course.time = "17:45-21:00";
//		course.credit = 4;
//		course.capacity = 15;
//		
//		
//		
//		System.out.println(course);
//	}
	
}
