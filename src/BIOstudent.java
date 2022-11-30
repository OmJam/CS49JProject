import java.util.ArrayList;

public class BIOstudent extends genericStudent implements assignStudent {
    private String name;
    private int ID;
    private ArrayList<String> schedule;
    private double GPA;

    public BIOstudent(String n) {
        this.name = n;

    }

    @Override
    // HAVE AND ARRAYLIST OF Predetermined Classes and randomly choose 3
    // To generate
    public ArrayList<String> generateSchedule() {
        schedule = new ArrayList<String>();
        ArrayList<String> BIOclass = new ArrayList<String>();

        BIOclass.add("Pre-Calculus 2");
        BIOclass.add("ENGL 101A");
       //BIOclass.add("PHYSICS-50");
        BIOclass.add("Intro to Biology");
        //BIOclass.add("BIOineering Statistics");
        BIOclass.add("Modern Biology");

        for (int i = 0; i < 3; i++) {
            int random = (int) ((Math.random() * (BIOclass.size() - 0)) + 0);
            schedule.add(BIOclass.get(random));
            BIOclass.remove(random);
        }
        return schedule;

    }

    // IMPLEMENT A RANDOM NUM GENERATOR
    //From #'s 3000-2001 BIO students
    public void genID() {
        int random = (int) (Math.random() * (3000-2001) + 1001);
        ID = random;
    }

    @Override
    public void calcGPA() {
        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println("ENTER GRADE FOR CLASS ");
        }

    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        System.out.println("NAME: " + name + "GPA: " + GPA);
        System.out.println("SCHDEULE: ");
        for (int i = 0; i < schedule.size(); i++) {
            System.out.print(schedule.get(i) + " | ");
        }
        System.out.println();

    }

}