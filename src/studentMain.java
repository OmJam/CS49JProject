import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//Main program
public class studentMain {
    public static LinkedList<assignStudent> ENGRschool = new LinkedList<assignStudent>();
    public static ArrayList<assignStudent> SCIschool = new ArrayList<assignStudent>();
    public static Stack<assignStudent> BIOschool = new Stack<assignStudent>();
    public static Stack<assignStudent> re_BIOschool = new Stack<assignStudent>();
    public static ArrayList<assignStudent> Professor = new ArrayList<assignStudent>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);
        Scanner file = new Scanner(System.in);

        int userChoice = 0;
        System.out.println("Enter Information through File, Keyboard, or GUI?");
        System.out.println("(1) for File | (2) for Keyboard | (3) for GUI");
        userChoice = scan.nextInt();
        scan.nextLine();

        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
            System.out.println("INVALID INPUT: Type (1) for FILE or (2) for keyboard (3) for GUI");
            userChoice = scan.nextInt();
            scan.nextLine();
        }
        // IMPLEMENT FILES HERE
        // USER WANTS TO ENTER INFORMATION THROUGH FILES
        if (userChoice == 3) {
            studentGUI user = new studentGUI();
        }

        if (userChoice == 1) {

            System.out.println("ENTER FILE NAME: ");
            String fileName = file.nextLine();

            System.out.println(
                    "Which School for enrollment? (1) for Engineering, (2) for Science, (3) for Biology, and (4) for Professor");
            int studentMajor = scnr.nextInt();

            while (studentMajor != 1 && studentMajor != 2 && studentMajor != 3 && studentMajor != 4) {
                System.out.println("Enter a valid school: (1) Engineering, (2) Science, (3) Biology, (4) Professor");
                studentMajor = scnr.nextInt();
            }
            // ENGR STUDENT ADD THROUGH FILES
            if (studentMajor == 1) {
                try {
                    Scanner fileScan = new Scanner(new File(fileName));
                    String name;
                    int age;
                    while (fileScan.hasNextLine()) {
                        name = fileScan.next();
                        age = fileScan.nextInt();
                        ENGRstudent student = new ENGRstudent(name, age);
                        ENGRschool.add(student);
                    }
                    fileScan.close();
                } catch (Exception except) {
                    System.out.println("Error in opening input file " + except.getMessage());
                }

            }
            // SCI Student add through files
            if (studentMajor == 2) {
                try {
                    Scanner fileScan = new Scanner(new File(fileName));
                    String name;
                    int age;
                    while (fileScan.hasNextLine()) {
                        name = fileScan.next();
                        age = fileScan.nextInt();
                        SCIstudent student = new SCIstudent(name, age);
                        SCIschool.add(student);
                    }
                    fileScan.close();
                } catch (FileNotFoundException except) {
                    System.out.println("Error in opening input file " + except.getMessage());
                }

            }
            if (studentMajor == 3) {
                try {
                    Scanner fileScan = new Scanner(new File(fileName));
                    String name;
                    int age;
                    while (fileScan.hasNextLine()) {
                        name = fileScan.next();
                        age = fileScan.nextInt();
                        BIOstudent student = new BIOstudent(name, age);
                        BIOschool.push(student);
                    }
                    fileScan.close();
                } catch (FileNotFoundException except) {
                    System.out.println("Error in opening input file " + except.getMessage());
                }

            }
            if (studentMajor == 4) {
                try {
                    Scanner fileScan = new Scanner(new File(fileName));
                    String name;
                    int age;
                    while (fileScan.hasNextLine()) {
                        name = fileScan.next();
                        age = fileScan.nextInt();
                        Professor student = new Professor(name, age);
                        Professor.add(student);
                    }
                    fileScan.close();
                } catch (FileNotFoundException except) {
                    System.out.println("Error in opening input file " + except.getMessage());
                }
            }
        }
        // USER WANTS TO ENTER THROUGH KEYBOARD
        if (userChoice == 2) {
            int userStop = 1;
            System.out.println(
                    "Would you like to enter enrollment Information? (Enter '0' to stop, Enter any other number to START)");
            userStop = scan.nextInt();
            while (userStop != 0) {
                System.out.println(
                        "Which School for enrollment? (1) for Engineering, (2) for Science, (3) for Biology, and (4) for Professor");
                int studentMajor = scan.nextInt();

                while (studentMajor != 1 && studentMajor != 2 && studentMajor != 3 && studentMajor != 4) {
                    System.out
                            .println("Enter a valid school: (1) Engineering, (2) Science, (3) Biology, (4) Professor");
                    studentMajor = scnr.nextInt();
                }

                String name;
                int age;
                System.out.println("Enter Name: ");
                name = scnr.nextLine();
                System.out.println("Enter Age: ");
                age = scan.nextInt();
                if (studentMajor == 1) {
                    ENGRstudent student = new ENGRstudent(name, age);
                    ENGRschool.add(student);
                } else if (studentMajor == 2) {
                    SCIstudent student = new SCIstudent(name, age);
                    SCIschool.add(student);
                } else if (studentMajor == 3) {
                    BIOstudent student = new BIOstudent(name, age);
                    BIOschool.push(student);
                } else if (studentMajor == 4) {
                    Professor professor = new Professor(name, age);
                    Professor.add(professor);
                }
                System.out.println("Would you like to continue enter enrollement Information? (Enter '0' to stop)");
                userStop = scan.nextInt();
            }
        }

        // PRINTING STUDENT INFO HERE/Putting ID's in an array
        int[] ENGR_ID = new int[ENGRschool.size()];
        int[] SCI_ID = new int[SCIschool.size()];

        for (int i = 0; i < ENGRschool.size(); i++) {
            ((ENGRstudent) ENGRschool.get(i)).printInfo();
            ENGR_ID[i] = ((ENGRstudent) ENGRschool.get(i)).getID();
            System.out.println();
        }

        for (int i = 0; i < SCIschool.size(); i++) {
            ((SCIstudent) SCIschool.get(i)).printInfo();
            SCI_ID[i] = ((SCIstudent) SCIschool.get(i)).getID();
            System.out.println();
        }

        while (!BIOschool.empty()) {
            ((BIOstudent) BIOschool.peek()).printInfo();
            re_BIOschool.push(BIOschool.pop());
            System.out.println();
        }

        for (int i = 0; i < Professor.size(); i++) {
            ((Professor) Professor.get(i)).printInfo();
            System.out.println();
        }

        // SORT ID's
        IDSort(ENGR_ID, 0, ENGR_ID.length - 1);
        IDSort(SCI_ID, 0, SCI_ID.length - 1);

        if (userChoice == 1 || userChoice == 2) {
            int outFileChoice = 0;
            System.out.println("Output enrollement information to File? (1) Yes | (2) No");
            outFileChoice = scan.nextInt();
            while (outFileChoice != 1 && outFileChoice != 2) {
                System.out.println("Enter valid number! Output enrollment information  to File? (1) Yes | (2) No");
                outFileChoice = scan.nextInt();

            }
            if (outFileChoice == 1) {
                System.out.println("ENTER FILE NAME: ");
                String outFileName = file.nextLine();
                try {
                    FileWriter FileWriter = new FileWriter(outFileName);

                    FileWriter.write("[ENGINEERING STUDENTS]\n");
                    for (int i = 0; i < ENGRschool.size(); i++) {
                        FileWriter.write(" | NAME: " + ((ENGRstudent) ENGRschool.get(i)).getName() + " | AGE: "
                                + ((ENGRstudent) ENGRschool.get(i)).getAge() + " | ID: "
                                + ((ENGRstudent) ENGRschool.get(i)).getID() + " |\n");
                    }

                    FileWriter.write("[SCIENCE STUDENTS]\n");

                    for (int i = 0; i < SCIschool.size(); i++) {
                        FileWriter.write(" | NAME: " + ((SCIstudent) SCIschool.get(i)).getName() + " | AGE: "
                                + ((SCIstudent) SCIschool.get(i)).getAge() + " | ID: "
                                + ((SCIstudent) SCIschool.get(i)).getID() + "|\n");
                    }
                    FileWriter.write("[BIOLOGY STUDENTS]\n");

                    while (!re_BIOschool.empty()) {
                        FileWriter.write(" | NAME: " + ((BIOstudent) re_BIOschool.peek()).getName() + " | AGE: "
                                + ((BIOstudent) re_BIOschool.peek()).getAge() + " | ID: "
                                + ((BIOstudent) re_BIOschool.peek()).getID() + "|\n");
                        re_BIOschool.pop();

                    }

                    FileWriter.write("[PROFESSOR]\n");

                    for (int i = 0; i < Professor.size(); i++) {
                        FileWriter.write(" | NAME: " + ((Professor) Professor.get(i)).getName() + " | AGE: "
                                + ((Professor) Professor.get(i)).getAge() + " | ID: "
                                + ((Professor) Professor.get(i)).getID() + "|\n");
                    }

                    FileWriter.close();

                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("[END OF PROGRAM]");
        }
        scan.close();
        scnr.close();
    }

    public static void merge(int[] numbers, int i, int j, int k) {
        int mergedSize = k - i + 1;
        int[] mergedNumbers = new int[mergedSize];

        int mergePos = 0;
        int leftPos = i;
        int rightPos = j + 1;

        while (leftPos <= j && rightPos <= k) {
            if (numbers[leftPos] <= numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                leftPos++;
            } else {
                mergedNumbers[mergePos] = numbers[rightPos];
                rightPos++;
            }
            mergePos++;
        }

        while (leftPos <= j) {
            mergedNumbers[mergePos] = numbers[leftPos];
            leftPos++;
            mergePos++;
        }

        while (rightPos <= k) {
            mergedNumbers[mergePos] = numbers[rightPos];
            rightPos++;
            mergePos++;
        }

        for (mergePos = 0; mergePos < mergedSize; mergePos++) {
            numbers[i + mergePos] = mergedNumbers[mergePos];
        }
    }

    public static void IDSort(int[] numbers, int i, int k) {
        int j = 0;

        if (i < k) {
            j = (i + k) / 2;

            IDSort(numbers, i, j);
            IDSort(numbers, j + 1, k);
            merge(numbers, i, j, k);
        }
    }

}
