# StudentData
Use Case and Problem Statement
You are given SQL / NoSQL Database which has a list of students, each with attributes
such as name, grade level, GPA, gender, and a list of activities they participate in. Your task
is to perform various operations on this list to extract meaningful information and return
the results in specified formats.

Tasks
1. Count Male and Female Students
• Problem Statement: Write a method to count the number of male and
female students in the list.
• Expected Output: Return the result in a
class MaleAndFemaleContainer with two fields: males and females.

2. Add Prefix to Student Names
• Problem Statement: Write a method to add a prefix to each student's name
based on their gender. Use "Mr." for male students and "Ms." for female
students.
• Expected Output: Return the list of students with updated names.

4. Count Students by Grade Level
• Problem Statement: Write a method to count the number of students in
each grade level.
• Expected Output: Return the result in a class GradeLevelContainer with two
fields: gradeLevel and students.

5. Count Students by Activity
• Problem Statement: Write a method to count the number of students
participating in each type of activity.
• Expected Output: Return the result in a class ActivityContainer with two
fields: activity and students.

6. Group Students by GPA
• Problem Statement: Write a method to group students based on their GPA
into three categories: Poor (0 - 4.0), Average (4.1 - 7.0), and Excellent (> 7.1).
• Expected Output: Return the result in a class PerformanceContainer with
two fields: level and students.

NOTE: Use Java streams and Completable Futures (both mandatory) while handling
Student List data.

Running the Project

Ensure Java 17 is installed.

Compile the code

Run the java application
