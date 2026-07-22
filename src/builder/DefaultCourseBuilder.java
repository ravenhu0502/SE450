package builder;

import factory.Professor;
import state.IState;

public class DefaultCourseBuilder implements ICourseBuilder {
	private Course course;
	
	public DefaultCourseBuilder() {
		course = new Course();
	}
	
	@Override
	public void setDepartment(String department) {
		this.course.setDepartment(department);
	}

	@Override
	public void setSubject(String subject) {
		this.course.setSubject(subject);
	}

	@Override
	public void setCourseNum(int courseNum) {
		this.course.setCourseNum(courseNum);
	}

	@Override
	public void setName(String name) {
		this.course.setName(name);
	}

	@Override
	public void setLocation(String location) {
		this.course.setLocation(location);
	}

	@Override
	public void setRoomNum(int roomNum) {
		this.course.setRoomNum(roomNum);
	}

	@Override
	public void setDay(String day) {
		this.course.setDay(day);
	}

	@Override
	public void setTime(String time) {
		this.course.setTime(time);
	}

	@Override
	public void setProfessor(Professor professor) {
		this.course.setProfessor(professor);
	}

	@Override
	public void setCredit(int credit) {
		this.course.setCredit(credit);
	}

	@Override
	public void setCapacity(int capacity) {
		this.course.setCapacity(capacity);
	}

	@Override
	public void setInitialState(IState initialState) {
		this.course.setState(initialState);
	}

	@Override
	public Course build() {
		return course;
	}
	
}
