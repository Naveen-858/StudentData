## StudentDataList using Java Streams and CompletableFuture

# Overview :

	This project processes a list of students with attributes such as name, grade level, GPA, gender, and activities. 
	It performs various operations using Java Streams and CompletableFuture for asynchronous data handling.

## Features: 

 Count Male and Female Students

	count the number of male and female students in the list.
	Return the result in a class MaleAndFemaleContainer with two fields: males and females.

 Add Prefix to Student Names

	Add a prefix to each student using "Mr." for male students and "Ms." for female students.
	Return the list of students with updated names.

 Count Students by Grade Level

	count the number of students in each grade level.
	Return the result in a class GradeLevelContainer with two fields: gradeLevel and students.

 Count Students by Activity

	count the number of students participating in each type of activity.
	Return the result in a class ActivityContainer with two fields: activity and students.

 Group Students by GPA

	group students based on their GPA into three categories: Poor (0 - 4.0), Average (4.1 - 7.0), and Excellent (> 7.1).
	Return the result in a class PerformanceContainer with two fields: level and students.

## Technologies Used:
	Java
	Streams
	CompletableFuture
	Collections Functionalities

## IDE :

	Eclipse, VsCode

## Execution :

	Compile and run the main class StudentDataApplication.java


## Final Output:

MaleAndFemaleCount

	Prints the MaleAndFemaleCount [males=5, females=4]

Gender Prefix

	Prints the  gender prefix Student [name=Mr. Naveen, gender=Male, gradeLevel=10, gpa=8.5, activities=[browsing, Singing]]
	Prints the  gender prefix Student [name=Ms. Vijaya, gender=Female, gradeLevel=9, gpa=5.0, activities=[Drama, Music]]
	Prints the  gender prefix Student [name=Mr. Akhil, gender=Male, gradeLevel=8, gpa=6.5, activities=[Football]]
	Prints the  gender prefix Student [name=Mr. Shiva, gender=Male, gradeLevel=10, gpa=7.8, activities=[Art]]
	Prints the  gender prefix Student [name=Mr. Sunil, gender=Male, gradeLevel=10, gpa=6.7, activities=[Art,Collections]]
	Prints the  gender prefix Student [name=Mr. Mohan, gender=Male, gradeLevel=4, gpa=3.5, activities=[Music ,Collections]]
	Prints the  gender prefix Student [name=Ms. Kumari, gender=FeMale, gradeLevel=8, gpa=4.7, activities=[Art,Cricket]]
	Prints the  gender prefix Student [name=Ms. Keerthi, gender=Female, gradeLevel=9, gpa=4.5, activities=[Music]]
	Prints the  gender prefix Student [name=Ms. Akhila, gender=Female, gradeLevel=5, gpa=3.2, activities=[Carroms,Painting]]

Grade Level

	[GradeLevel [gradeLevel=4, students=1], GradeLevel [gradeLevel=5, students=1], GradeLevel [gradeLevel=8, students=2], GradeLevel [gradeLevel=9, students=2], GradeLevel [gradeLevel=10, students=3]]

Activity Count

	[ActivityCount [activity=browsing, students=1], ActivityCount [activity=Art, students=1], ActivityCount [activity=Singing, students=1], ActivityCount [activity=Art,Cricket, students=1], ActivityCount [activity=Music ,Collections, students=1], ActivityCount [activity=Drama, students=1], ActivityCount [activity=Art,Collections, students=1], ActivityCount [activity=Music, students=2], ActivityCount [activity=Carroms,Painting, students=1], ActivityCount [activity=Football, students=1]]

Performance Count

	PerformanceCount [level=POOR, students=[Student [name=Mr. Mohan, gender=Male, gradeLevel=4, gpa=3.5, activities=[Music ,Collections]], Student [name=Ms. Akhila, gender=Female, gradeLevel=5, gpa=3.2, activities=[Carroms,Painting]]]]

	PerformanceCount [level=AVERAGE, students=[Student [name=Ms. Vijaya, gender=Female, gradeLevel=9, gpa=5.0, activities=[Drama, Music]], Student [name=Mr. Akhil, gender=Male, gradeLevel=8, gpa=6.5, activities=[Football]], Student [name=Mr. Sunil, gender=Male, gradeLevel=10, gpa=6.7, activities=[Art,Collections]], Student [name=Ms. Kumari, gender=FeMale, gradeLevel=8, gpa=4.7, activities=[Art,Cricket]], Student [name=Ms. Keerthi, gender=Female, gradeLevel=9, gpa=4.5, activities=[Music]]]]

	PerformanceCount [level=EXCELLENT, students=[Student [name=Mr. Naveen, gender=Male, gradeLevel=10, gpa=8.5, activities=[browsing, Singing]], Student [name=Mr. Shiva, gender=Male, gradeLevel=10, gpa=7.8, activities=[Art]]]]
