import java.util.ArrayList;
import java.util.Scanner;

public class SCIstudent extends genericStudent implements assignStudent {
    private String name;
    private int age;
    private int ID;
    private ArrayList<String> schedule;
    private double GPA;

    public SCIstudent(String n, int a) {
        genID();
        generateSchedule();
        this.name = n;
        age = a;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getSchedule() {
        return schedule;
    }

    @Override
    // HAVE AND ARRAYLIST OF Predetermined Classes and randomly choose 3
    // To generate
    public ArrayList<String> generateSchedule() {
        schedule = new ArrayList<String>();
        ArrayList<String> SCIclass = new ArrayList<String>();
        SCIclass.add("Calculus-1");
        SCIclass.add("PHYSICS-50");
        SCIclass.add("Biology-1");
        SCIclass.add("Chemistry-1A");
        SCIclass.add("Oraganic-Chemistry");
        SCIclass.add("Phyical Education");
        SCIclass.add("Ecology");
        SCIclass.add("Phyisology");

        for (int i = 0; i < 4; i++) {
            int random = (int) ((Math.random() * (SCIclass.size() - 0)) + 0);
            schedule.add(SCIclass.get(random));
            SCIclass.remove(random);
        }
        return schedule;

    }

    @Override

    // IMPLEMENT A RANDOM NUM GENERATOR

    public void genID() {
        int random = ENGRstudent.genID_ENGR() + 1000;
        ID = random;
    }

    public int getID() {
        return ID;
    }

    @Override
    public void calcGPA() {
        Scanner scan = new Scanner(System.in);
        int userCorrect = 1;
        double grade1 = 0;
        int finalGPA = 0;
        do {
            try {
                for (int i = 1; i <= 4; i++) {
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

        finalGPA /= 4;
        GPA = finalGPA;
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
        // System.out.printf(" GPA: %.2f\n", GPA);
        System.out.print("| SCHDEULE: ");
        for (int i = 0; i < schedule.size(); i++) {
            System.out.print(schedule.get(i) + " | ");
        }
        System.out.println();
        System.out.println();

    }

}