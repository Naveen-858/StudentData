package com.studentDataList.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.studentDataList.entity.ActivityCount;
import com.studentDataList.entity.GradeLevel;
import com.studentDataList.entity.MaleAndFemaleCount;
import com.studentDataList.entity.PerformanceCount;
import com.studentDataList.entity.Student;

public class StudentService {

	public static CompletableFuture<MaleAndFemaleCount> countMaleAndFemale(List<Student> students) {
		return CompletableFuture.supplyAsync(() -> {
			long males = students.stream().filter(m -> "Male".equalsIgnoreCase(m.getGender())).count();
			long females = students.stream().filter(f -> "Female".equalsIgnoreCase(f.getGender())).count();
			return new MaleAndFemaleCount(males, females);
		});

	}

	public static CompletableFuture<List<Student>> addPrefixToGender(List<Student> students) {
		return CompletableFuture.supplyAsync(() -> students.stream().peek(student -> {
			String prefix = "Male".equalsIgnoreCase(student.getGender()) ? "Mr. " : "Ms. ";
			student.setName(prefix + student.getName());
		}).collect(Collectors.toList()));

	}

	public static CompletableFuture<List<GradeLevel>> countByGradeLevel(List<Student> students) {
		return CompletableFuture.supplyAsync(() -> students.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.counting())).entrySet().stream()
				.map(entry -> new GradeLevel(entry.getKey(), entry.getValue())).collect(Collectors.toList()));
	}

	public static CompletableFuture<List<ActivityCount>> countByActivity(List<Student> students) {
		return CompletableFuture.supplyAsync(() -> students.stream()
				.flatMap(student -> student.getActivities().stream())
				.collect(Collectors.groupingBy(activity -> activity, Collectors.counting())).entrySet().stream()
				.map(entry -> new ActivityCount(entry.getKey(), entry.getValue())).collect(Collectors.toList()));

	}

	public static CompletableFuture<List<PerformanceCount>> groupByGPA(List<Student> students) {
		return CompletableFuture.supplyAsync(() -> {
			List<Student> poor = students.stream().filter(p -> p.getGpa() < 4.0).collect(Collectors.toList());
			
			List<Student> average = students.stream().filter(a -> a.getGpa() > 4.0 && a.getGpa() < 7.0).collect(Collectors.toList());
			
			List<Student> excellent = students.stream().filter(e -> e.getGpa() > 7.1).collect(Collectors.toList());

			return List.of(new PerformanceCount("POOR", poor),
					new PerformanceCount("AVERAGE", average),
					new PerformanceCount("EXCELLENT", excellent));
		});

	}

}
