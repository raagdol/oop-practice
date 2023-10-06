package org.example.grade;

import java.util.List;

// 일급 컬렉션: Courses
// List<Course>를 포함하는 컬렉션을 캡슐화하고 있으며
// 이 컬렉션과 관련된 연산을 수행할 수 있는 메서드를 제공함

public class Courses {
	private final List<Course> courses;

	public Courses(List<Course> courses) {
		this.courses = courses;
	}

	public double multiplyCreditAndCourseGrade() {
		return courses.stream()
						.mapToDouble(Course::multiplyCreditAndCourseGrade)
						.sum();
	}

	public int calculateTotalCompletedCredit() {
		return courses.stream()
						.mapToInt(Course::getCredit)
						.sum();
	}
}
