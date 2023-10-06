package org.example.grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수 X 교과목 평점)의 합계 / 수강신청 총학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
	// 학점 계산기 도메인: 이수한 과목, 학점 계산기
	// 이수한 과목 --> 과목(코스) 클래스로 표현
	// > 동적인 객체를 정적인 타입으로 추상화하여 도메인 모델링

	// 이수한 과목을 전달하여 평균학점 계산을 요청 --> 학점 계산기 --> (학점수 X 교과목 평점)의 합계 -> 과목(코스)
	// 																														 --> 수강신청 총학점 수						 -> 과목(코스)

	@DisplayName("평균 학점을 계산한다.")
	@Test
	void calculateGradeTest() {
		List<Course> courses = List.of(new Course("OOP", 3, "A+"),
						new Course("자료구조", 1, "A+"));

		GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
		double gradeResult = gradeCalculator.calculateGrade();

		assertThat(gradeResult).isEqualTo(4.5);
	}


}
