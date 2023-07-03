package Java_Week.Java_Week_19;

public class Student extends Person {

    private int studentNumber;
    private String unicourse;

    @Override
    public void display(){
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Course: " + unicourse);
    }

    public int getStudentNumber() {return studentNumber;}
    public void setStudentNumber(int studentNumber) {this.studentNumber = studentNumber;}

    public String getUnicourse() {return unicourse;}
    public void setUnicourse(String unicourse) {this.unicourse = unicourse;}

    public Student(String name, String email, int age, int studentNumber, String uniCourse) {
        setName(name);
        setEmail(email);
        setAge(age);
        setStudentNumber(studentNumber);
        setUnicourse(uniCourse);
    }
}

