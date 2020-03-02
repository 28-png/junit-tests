import java.util.ArrayList;
import java.util.Arrays;


public class Student {
    private long id;
    private static long counter;
    private String name;
    private ArrayList<Integer> grades;

   public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


   public void addGrade(int grade) {
       grades.add(grade);
   }

    public double getGradeAverage() {
        double sum = 0;

        for(int i=0; i < grades.size(); i++){
            sum += (double) grades.indexOf(i);
        }

        return sum/grades.size();

    }


}