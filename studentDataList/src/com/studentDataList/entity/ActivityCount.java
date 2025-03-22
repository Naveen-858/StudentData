package com.studentDataList.entity;

public class ActivityCount {

	private String activity;
	private long students;

	public ActivityCount(String activity, long students) {
		super();
		this.activity = activity;
		this.students = students;
	}

	@Override
	public String toString() {
		return "ActivityCount [activity=" + activity + ", students=" + students + "]";
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public long getStudents() {
		return students;
	}

	public void setStudents(long students) {
		this.students = students;
	}
}
