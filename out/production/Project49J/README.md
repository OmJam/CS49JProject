# CS49JProject
1) GITHUB LINK:
   https://github.com/OmJam/CS49JProject


2) Presentation Link:https://docs.google.com/presentation/d/1AqsaOF7WIXUwbvyL8uch3PyS-pL5vFLUgpUPNa5SjNs/edit?usp=sharing


4) Classes
   1) assignStudent.java: Interface class. Used 
    to implement generateSchedule() and genID().
   2) genericStudent.java: Abstract class. Basic student class
      (containts calcGPA() and printInfo())
   3) ENGRstudent.java
        1) Engineering Student Object
        2) Contains private variables name, age, ID, scheduel, and GPA
        3) Methods: accessor methods for all private variables, generateSchedule(), genID(),
            calcGPA(), printInfo()
   4) SCIstudent.java
        1) Science student Object
        2) Same private variables and methods as Engineering Student
   5) BIOstudent.java
      1)Biology student object
      2)Private variables name, age, ID, schedule, and GPA
      3)Methods: getter methods for all private variables, BIOstudent takes input name and age, gets them and then calls the function generateSchedule which will make         a 3 class schedule, and also has the function genID which uses random to create an ID for the student.
      4)Simple getter methods: getAge(), getID(), getName() 
      5)Function, ArrayList<String> generateSchedule(): This function uses ArrayList which will contain 5 classes that we add, then we enter a for loop which will           randomly pick 3 of the 5 classes and then return that 3 class schedule. 
      6)genID() : creates an ID for Biology students using the randomly generated ID from the ENGRstudent.java class.
      7)printInfo() : prints name, age, ID, and schedule.

   6) Professor.java
      1)Professor object
      2)Private variables name, age, ID, schedule, and GPA
      3)Methods: getter methods for all private variables, Professor takes input name and age, gets them and then calls the function generateSchedule which will make a 3       class schedule, and also has the function genID which uses random to create an ID for the student.
      4)Simple getter methods: getAge(), getID(), getName() 
      5)Function, ArrayList<String> generateSchedule(): This function uses ArrayList which will contain 5 classes that we add, then we enter a for loop which will             randomly pick 3 of the 5 classes and then return that 3 class schedule. 
      6)genID() : creates an ID for Professors using the randomly generated ID from the ENGRstudent.java class.
      7)day(int classes) : This is a recursion function that will tell the Professor how many classes he needs to teach after he completes one lecture. 
      8)printInfo() : prints name, age, ID, and schedule.

   
   7) studentMain.java
      1) Main Program
      2) Takes user input through file or keyboard to create student objects ("ENROLLMENT").
      3) Outputs students into console and/or file
      
   8) studentGUI.java
      1) GUI to enter student Information
      2) Has name, age, and school field to input information
      3) Outputs info to console
   

4) Methods
   1) public ArrayList<String> generateSchedule()
      1) Predefined college classes are in a ArrayList. 
      2) A selected number of classes
      are chosen from the predefined ArrayList and assigned to a student object.
   2) public void genID()
      1) Random number in range is generated using the formula
:
      Math.random() * (max - min) + min
      2) That random number is assigned to a student Object
   3) public void calcGPA()
        1) GPA for student object is either weighed or unweighed.
        2) Student enters numerical grades which is converted into a 
        GPA.
   4) public void printInfo() 
      1) Output method for student objects.
      2) Name, Age, ID, and Schedule is outputted.
   5) public static void IDSort(int[] numbers, int i, int k) and mergeSort()
      1) Merge Sort implementation for student object ID's
      2) Sorts ID's in ascending order
      3) IDSort takes in array of values, the lowest Index, and highest Index of array to be sorted
      4) Uses helper method merge() for sorting.
