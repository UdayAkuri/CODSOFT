
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student {
    public Student(){
        this.studentID = sno++;
    }
    static int sno=0,dummy;
    int engMarks, sciMarks, mathMarks, studentID, totalMarks;
    float averageMarks;
    String sName,sGrade;
    Scanner c;
    static List<Student> l;

    public static void main(String[] args){
       Student student = new Student();
       l = student.studentList();
       Iterator<Student> itr = l.iterator();
       while(itr.hasNext()){
        Student std = itr.next();
        System.out.println(std.toString());
       }
    }

    public boolean string(){
        boolean flag=false;
        while(true) {
            System.out.println("Enter Student details --> type \"yes\" Or \"no\": ");
            String string = c.nextLine();
            if (string.trim().toLowerCase().equals("yes")) {
                flag = true;
                break;
            } else if (string.trim().toLowerCase().equals("no")) {
                flag = false;
                break;
            } else {
                System.out.println("Enter valid String \n\"yes\" to add student details Or \n\"no\" to continue for next step : ");
            }
        }
        return flag;
    }

    public List studentList(){
        List<Student> l = new ArrayList<>();
        while(true){
            c = new Scanner(System.in);
            boolean flag = string();
            if(flag){
                Student s = new Student();
                System.out.println("Enter name of the Student: ");
                s.sName = c.nextLine();
                while(true) {
                    System.out.println("Enter English Marks Out of 100 : ");
                    s.dummy = c.nextInt();
                    if (s.dummy >= 0 && s.dummy <= 100) {
                        s.engMarks = dummy;
                        dummy = 0;
                        break;
                    } else {
                        System.out.println("Entre Valid Marks From 0 to 100 Only");
                    }
                }
                while(true) {
                    System.out.println("Enter Math Marks Out of 100 : ");
                    s.dummy = c.nextInt();
                    if (s.dummy >= 0 && s.dummy <= 100) {
                        s.mathMarks = dummy;
                        dummy = 0;
                        break;
                    } else {
                        System.out.println("Entre Valid Marks From 0 to 100 Only");
                    }
                }
                while(true) {
                    System.out.println("Enter Science Marks Out of 100 : ");
                    s.dummy = c.nextInt();
                    if (s.dummy >= 0 && s.dummy <= 100) {
                        s.sciMarks = dummy;
                        dummy = 0;
                        break;
                    } else {
                        System.out.println("Entre Valid Marks From 0 to 100 Only");
                    }
                }
                s.totalMarks = s.engMarks+s.sciMarks+s.mathMarks;
                s.averageMarks = (float) (s.totalMarks/3.0);
                if(s.engMarks<35||s.mathMarks<35||s.sciMarks<35){
                    s.sGrade="Fail";
                } else if(s.averageMarks<=100&&s.averageMarks>90){
                    s.sGrade="OutStanding";
                } else if (s.averageMarks<=90&&s.averageMarks>80) {
                    s.sGrade="A1";
                } else if (s.averageMarks<=80&&s.averageMarks>70) {
                    s.sGrade="A";
                } else if (s.averageMarks<=70&&s.averageMarks>60) {
                    s.sGrade="B1";
                } else if (s.averageMarks<=60&&s.averageMarks>50) {
                    s.sGrade="B";
                } else if (s.averageMarks<=50&&s.averageMarks>40) {
                    s.sGrade="C";
                } else if (s.averageMarks<=40&&s.averageMarks>=35) {
                    s.sGrade="P";
                } else {
                    s.sGrade="Fail";
                }
                l.add(s);
            }else{
                break;
            }
        }
        return l;
    }

    @Override
    public String toString() {
        return "StudentID: "+this.studentID+" | StudentName: "+this.sName+" | EnglishMarks: "
                +this.engMarks+" | MathMarks: "+this.mathMarks+" | ScienceMarks: "+this.sciMarks+" | TotalMarks: "
                +this.totalMarks+" | AverageMarks: "+this.averageMarks+" | StudentGrade: "+this.sGrade;
    }
}
