import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public void addGrade(int grade){
        grades.add(grade);
    }

    public Student (String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    //setters

    public void setName (String name) {this.name = name;}
    public void setGrades (ArrayList<Integer> grades) {this.grades = grades;}

    //getters

    public String getName() {return this.name;}
    public ArrayList<Integer> getGrades() {return this.grades;}

//     main
    public static void main (String[] args) {
        Student student1 = new Student ("john", new ArrayList<Integer>(){});
        student1.addGrade(98);
        System.out.println(student1.getGrades() +"\n"+ student1.getName());
    }
}
