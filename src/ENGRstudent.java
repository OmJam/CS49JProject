import java.util.ArrayList;

public class ENGRstudent extends genericStudent implements assignStudent {
    private String name;
    private int ID;
    private ArrayList<String> schedule;
    private double GPA;

    public ENGRstudent(String n) {
        this.name = n;

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

    // IMPLEMENT A RANDOM NUM GENERATOR
    //From #'s 1001-2000 ENGR students
    public void genID() {
        int random = (int) (Math.random() * (2000-1001) + 1001);
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
