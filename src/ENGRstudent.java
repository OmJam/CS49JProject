import java.util.ArrayList;
import java.util.Scanner;

public class ENGRstudent extends genericStudent implements assignStudent {
    private String name;
    private int age;
    private int ID;
    private ArrayList<String> schedule;
    private double GPA;

    public ENGRstudent(String n, int a) {
        genID();
        generateSchedule();
        this.name = n;
        age = a;

    }

    @Override
    // HAVE AND ARRAYLIST OF Predetermined Classes and randomly choose 3
    // To generate
    public ArrayList<String> generateSchedule() {
        schedule = new ArrayList<String>();
        ArrayList<String> ENGRclass = new ArrayList<String>();

        ENGRclass.add("Calculus-1");
        ENGRclass.add("CMPE-30");
        ENGRclass.add("PHYSICS-50");
        ENGRclass.add("Intro to Engineering");
        ENGRclass.add("Engineering Statistics");
        ENGRclass.add("Engineering Reports");

        for (int i = 0; i < 3; i++) {
            int random = (int) ((Math.random() * (ENGRclass.size() - 0)) + 0);
            schedule.add(ENGRclass.get(random));
            ENGRclass.remove(random);
        }
        return schedule;

    }

    @Override

    // IMPLEMENT A RANDOM NUM GENERATOR
    // From #'s 1001-2000 ENGR students
    public void genID() {
        int random = (int) (Math.random() * (2000 - 1001) + 1001);
        ID = random;
    }

    public static void genIDENGR() {
        int random = (int) (Math.random() * (8000 - 7001) + 7001);
    }

    public int getID() {
        return ID;
    }

    @Override
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
        // System.out.printf(" | GPA: %.2f\n", GPA);
        System.out.print("| SCHDEULE: | ");
        for (int i = 0; i < schedule.size(); i++) {
            System.out.print(schedule.get(i) + " | ");
        }
        System.out.println();
        System.out.println();

    }

}
