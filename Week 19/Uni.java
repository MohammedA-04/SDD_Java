package Java_Week.Java_Week_19;

import java.util.ArrayList;

public class Uni {

    private ArrayList<Person> personArrayList;

    public Uni(){
        personArrayList = new ArrayList<>();
    }

    public void addPerson(Person person){
        personArrayList.add(person);
    }

    public void printAll(){
        for (Person person: personArrayList){
            person.display();
        }
    }

    public void printStudents(){
        for (Person person: personArrayList){
            if(person instanceof Student){
                person.display();
            }
        }

    }

    public static void main(String[] args) {

        Uni university = new Uni();

        Student student1 = new Student("Mo", "Mohammed@yahoo.com", 19, 2558365,"CS");
        Student student2 = new Student("Jane", "jane@example.com", 22, 987654, "Mathematics");
        Tutor tutor1 = new Tutor("Tom", "tom@example.com", 30, 101, "SDD 1");
        Tutor tutor2 = new Tutor("Lisa", "lisa@example.com", 28, 202, "COA 2");

        // Add the objects to the university's personList
        university.addPerson(student1);
        university.addPerson(student2);
        university.addPerson(tutor1);
        university.addPerson(tutor2);

        // Print all persons
        university.printAll();

        System.out.println();

        // Print only students
        university.printStudents();
    }

}
