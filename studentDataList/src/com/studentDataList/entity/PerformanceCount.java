package com.studentDataList.entity;

import java.util.List;

public class PerformanceCount {

	private String level;
	private List<Student> students;

	public PerformanceCount(String level, List<Student> students) {
		super();
		this.level = level;
		this.students = students;
	}

	@Override
	public String toString() {
		return "PerformanceCount [level=" + level + ", students=" + students + "]";
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
