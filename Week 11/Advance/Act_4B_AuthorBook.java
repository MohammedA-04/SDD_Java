package Advance;

public class Act_4B_AuthorBook
{
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        }else {
            this.age = 0;
        }
    }

    public boolean isTeen (){
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName (){
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }
        else {
            return firstName + " " + lastName;
        }
    }
}
