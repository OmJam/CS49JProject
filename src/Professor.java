import java.util.ArrayList;

public class Professor extends genericStudent implements assignStudent {
    private String name;
    private int ID;
    private ArrayList<String> schedule;
    private double GPA;

    public Professor(String n) {
        this.name = n;

    }

    @Override
    // HAVE AND ARRAYLIST OF Predetermined Classes and randomly choose 3
    // To generate
    public ArrayList<String> generateSchedule() {
        schedule = new ArrayList<String>();
        ArrayList<String> Profclass = new ArrayList<String>();

        Profclass.add("9 - 9:30 am");
        Profclass.add("9:30 - 10 am");
        Profclass.add("10 - 10:30 am");
        Profclass.add("10:30 - 11 am");
        Profclass.add("11 - 11:30 am");
        Profclass.add("11:30 - 12 pm");

        for (int i = 0; i < 3; i++) {
            int random = (int) ((Math.random() * (Profclass.size() - 0)) + 0);
            schedule.add(Profclass.get(random));
            Profclass.remove(random);
        }
        return schedule;

    }
    int classes = 3;
    public void teach(int classes){
        if (classes <= 0) {
            return "Done teaching for the day";
        } else {
            return teach(classes - 1);
        }
    }

    // Uses id from engrstudent file
    public void genID() {
     //   int random = (int) (Math.random() * (8000-7001) + 1001);
        ID = randomProf;
    }

    //ID for ENGRstudent
    public static void genIDengr{
        int randomENGR = (int) (Math.random() * (2000 - 1001) + 1001);
    }

    @Override
    public void calcGPA() {
        for(int i = 0 ; i < 30 ; i++)
        {
            System.out.println("ENTER GRADE FOR STUDENTS ");
        }

    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        System.out.println("NAME: " + name + "Professor ID: " + ID);
        System.out.println("SCHDEULE: ");
        for (int i = 0; i < schedule.size(); i++) {
            System.out.print(schedule.get(i) + " | ");
        }
        System.out.println();

    }

}