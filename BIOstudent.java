import java.util.ArrayList;
import java.util.Scanner;

public class BIOstudent extends genericStudent implements assignStudent {
    private String name;
    private int ID;
    private int age;
    private ArrayList<String> schedule;
    private double GPA;

    // CHANGE
    public BIOstudent(String n, int age) {
        this.name = n;
        this.age = age;
        generateSchedule();
        genID();

    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    // HAVE AND ARRAYLIST OF Predetermined Classes and randomly choose 3
    // To generate
    public ArrayList<String> generateSchedule() {
        schedule = new ArrayList<String>();
        ArrayList<String> BIOclass = new ArrayList<String>();

        BIOclass.add("Pre-Calculus 2");
        BIOclass.add("ENGL 101A");
        BIOclass.add("Advanced Biology");
        BIOclass.add("Intro to Biology");
        BIOclass.add("Disease Case Lab");
        BIOclass.add("Modern Biology");

        for (int i = 0; i < 3; i++) {
            int random = (int) ((Math.random() * (BIOclass.size() - 0)) + 0);
            schedule.add(BIOclass.get(random));
            BIOclass.remove(random);
        }
        return schedule;

    }

    // IMPLEMENT A RANDOM NUM GENERATOR
    // From #'s 3000-2001 BIO students
    public void genID() {

        int random = ENGRstudent.genID_ENGR() + 2000;// generate from 1001-2000

        ID = random;
    }

    public void calcGPA() {
        Scanner scan = new Scanner(System.in);
        int userCorrect = 1;
        double grade1 = 0;
        double finalGPA = 0;
        do {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("ENTER GRADE FOR CLASS #" + i);
                    grade1 = scan.nextDouble();
                    finalGPA += convertGPA(grade1);
                }
                userCorrect = 2;
            } catch (Exception e) {
                System.out.println("INVALID INPUT: Enter a NUMBER grade for Class!");
                scan.next();
                finalGPA = 0;
            }
            continue;
        } while (userCorrect == 1);

        finalGPA /= 3;
        GPA = finalGPA;
        scan.close();
        System.out.printf("GPA: %.2f\n", GPA);
    }

    public static int convertGPA(double grade) {

        if (grade < 60) {
            return 0;
        } else if (grade >= 60 && grade < 70) {
            return 1;
        } else if (grade >= 70 && grade < 80) {
            return 2;
        } else if (grade >= 80 && grade < 90) {
            return 3;
        }
        return 4;
    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        System.out.println("| NAME: " + name + " | Age: " + age + " | ID: " + ID);
        System.out.print("| SCHDEULE: | ");
        for (int i = 0; i < schedule.size(); i++) {
            System.out.print(schedule.get(i) + " | ");
        }
        System.out.println();

    }

}