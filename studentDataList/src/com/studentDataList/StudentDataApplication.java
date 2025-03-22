package com.studentDataList;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.studentDataList.entity.PerformanceCount;
import com.studentDataList.entity.Student;
import com.studentDataList.service.StudentService;

public class StudentDataApplication {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		List<Student> students = List.of(
				new Student("Naveen", "Male", 10, 8.5, List.of("browsing", "Singing")),
				new Student("Vijaya", "Female", 9, 5.0, List.of("Drama", "Music")),
				new Student("Akhil", "Male", 8, 6.5, List.of("Football")),
				new Student("Shiva", "Male", 10, 7.8, List.of("Art")),
				new Student("Sunil", "Male", 10, 6.7, List.of("Art,Collections")),
				new Student("Mohan", "Male", 4, 3.5, List.of("Music ,Collections")),
				new Student("Kumari", "FeMale", 8, 4.7, List.of("Art,Cricket")),
				new Student("Keerthi", "Female", 9, 4.5, List.of("Music")),
				new Student("Akhila", "Female", 5, 3.2, List.of("Carroms,Painting")));

		
		System.out.println("Prints the " + StudentService.countMaleAndFemale(students).get());

//		System.out.println(StudentService.addPrefixToGender(students).get());

		List<Student> students2 = StudentService.addPrefixToGender(students).get();
		for (Student student : students2) {
			System.out.println("Prints the  gender prefix " + student);
		}

		System.out.println(StudentService.countByGradeLevel(students).get());
		System.out.println(StudentService.countByActivity(students).get());
//		System.out.println(StudentService.groupByGPA(students).get());
		List<PerformanceCount> students3=StudentService.groupByGPA(students).get();
		for(PerformanceCount student : students3) {
			System.out.println(student);
		}
			

	}

}
