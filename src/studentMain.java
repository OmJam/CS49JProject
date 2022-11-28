import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class studentMain {
    static LinkedList<assignStudent> ENGRschool = new LinkedList<assignStudent>();
    static ArrayList<assignStudent> SCIschool = new ArrayList<assignStudent>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);

        int userChoice = 0;
        System.out.println("Enter Information through File or Keyboard?");
        System.out.println("(1) for File | (2) for Keyboard");
        userChoice = scan.nextInt();
        while (userChoice != 1 && userChoice != 2) {
            System.out.println("INVALID INPUT: Type '1' for FILE and '2' for keyboard");
            userChoice = scan.nextInt();
        }
        // IMPLEMENT FILES HERE
        //USER WANTS TO ENTER INFORMATION THROUGH FILES
        if (userChoice == 1) {
            System.out.println("ENTER FILE NAME: ");
            String fileName = scnr.next();
            System.out.println("What School are these Students from? (1) for ENGR, (2) for SCI");
            int studentMajor = scan.nextInt();
            //ENGR STUDENT ADD THROUGH FILES
            if (studentMajor == 1) {
                try {
                    Scanner fileScan = new Scanner(new File(fileName));
                    String name;
                    int age;
                    while (fileScan.hasNextLine()) {
                        name = fileScan.next();
                        System.out.println(name);
                        age = fileScan.nextInt();
                        System.out.println(age);
                        ENGRstudent student = new ENGRstudent(name, age);
                        ENGRschool.add(student);
                    }
                    fileScan.close();
                } catch (FileNotFoundException except) {
                    System.out.println("Error in opening input file " + except.getMessage());
                }

            }
            //SCI Student add through files
            if (studentMajor == 2) {
                try {
                    Scanner fileScan = new Scanner(new File(fileName));
                    String name;
                    int age;
                    while (fileScan.hasNextLine()) {
                        name = fileScan.next();
                        System.out.println(name);
                        age = fileScan.nextInt();
                        System.out.println(age);
                        SCIstudent student = new SCIstudent(name, age);
                        SCIschool.add(student);
                    }
                    fileScan.close();
                } catch (FileNotFoundException except) {
                    System.out.println("Error in opening input file " + except.getMessage());
                }

            }
        }
        //USER WANTS TO ENTER THROUGH KEYBOARD
        if (userChoice == 2) {
            int userStop = 1;
            System.out.println(
                    "Would you like to enter Student Information? (Enter '0' to stop, Enter any other number to START)");
            userStop = scan.nextInt();
            while (userStop != 0) {
                System.out.println("What major is this student? (Enter '1' for ENGR, '2' for SCIENCE)");
                int studentMajor = scan.nextInt();

                String name;
                int age;
                System.out.println("Enter Student Name: ");
                name = scnr.next();
                System.out.println("Enter Student Age: ");
                age = scan.nextInt();
                if (studentMajor == 1) {
                    ENGRstudent student = new ENGRstudent(name, age);
                    ENGRschool.add(student);
                } else if (studentMajor == 2) {
                    SCIstudent student = new SCIstudent(name, age);
                    SCIschool.add(student);
                }
                System.out.println("Would you like to continue enter Student Information? (Enter '0' to stop)");
                userStop = scan.nextInt();
            }
            scan.close();
            scnr.close();
        }

        //PRINTING STUDENT INFO HERE
        for (int i = 0; i < ENGRschool.size(); i++) {
            ((ENGRstudent) ENGRschool.get(i)).printInfo();
            System.out.println();
        }

        for (int i = 0; i < SCIschool.size(); i++) {
            ((SCIstudent) SCIschool.get(i)).printInfo();
            System.out.println();
        }

    }
}
