import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
//    private int length = grades.size();

    public void addGrade(int grade){
        grades.add(grade);
    }

//    public double getAverage (double grades) {
//       return grades/length;
//    }

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
        Student student1 = new Student ("bella swan", new ArrayList<Integer>(){});
        student1.addGrade(98);
        student1.addGrade(65);
        student1.addGrade(88);
        System.out.println("student's name: " + student1.getName() +"\n"+ student1.getName()+"'s grades: " + student1.getGrades());
        System.out.println("---------------------------------");

        Student student2 = new Student ("edward cullen", new ArrayList<Integer>(){});
        student2.addGrade(58);
        student2.addGrade(65);
        student2.addGrade(72);
        System.out.println("student's name: " + student2.getName() +"\n"+ student2.getName()+"'s grades: " + student2.getGrades());
        System.out.println("---------------------------------");

        Student student3 = new Student ("jacob black", new ArrayList<Integer>(){});
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(100);
        System.out.println("student's name: " + student3.getName() +"\n"+ student3.getName()+"'s grades: " + student3.getGrades());
        System.out.println("---------------------------------");
    }
}
