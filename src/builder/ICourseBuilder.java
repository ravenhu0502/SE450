package builder;

import factory.Professor;
import state.IState;

public interface ICourseBuilder {
	void setDepartment(String department);
	void setSubject(String subject);
	void setCourseNum(int courseNum);
	void setName(String name);
	void setLocation(String location);
	void setRoomNum(int roomNum);
	void setDay(String day);
	void setTime(String time);
	void setProfessor(Professor professor);
	void setCredit(int credit);
	void setCapacity(int capacity);
	void setInitialState(IState initialState);
	Course build();
}
