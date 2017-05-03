# assignment4
Assignment 4 – Time Comparable
Name
For this assignment, you will be updating the Time class from Assignment 1. To get started, you can either make a copy of your Assignment 1 Time.java, or download the solution from the course website.
First, you will need to update Time so that it implements the Comparable method. This will require adding an implements statement to the class declaration as well as the compareTo method. Then, you will need to add a difference method to the class. These two methods' requirements are as follows:
int compareTo(Object other)
//Returns -1 if current time is less than other. //Returns 0 if current time is equal to other. //Returns 1 if current time is greater than other.
String difference(Time t)
//Returns a String holding the difference between the current time and //the Time t passed in via parameter. All values should be positive, //and in the format:
//Time difference: 08:09
//Time difference: 10:35
To test your code, download and run the runner class: student_runner_time.java. We will use a different, but similar, test class to grade the program. You will need to change the runner to test with other values to make sure your program fits all the requirements.
Sample Run of student_runner_time.java:
      1712
      0945
      Greater than:
      1
      Less than:
      -1
      Times equal:
      0
      Hours equal, minutes not equal:
      1
      -1
      Difference
      Time difference: 00:11
      Time difference: 00:11
      Time difference: 00:00
