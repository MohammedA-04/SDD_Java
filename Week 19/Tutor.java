package Java_Week.Java_Week_19;

public class Tutor extends Person{

    private int officeNumber;
    private String moduleTaught;

    @Override
    public void display() {
        System.out.println("Tutor Details:");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Office Number: " + officeNumber);
        System.out.println("Module Taught: " + moduleTaught);
}

    // Getters and Setters
    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getModuleTaught() {
        return moduleTaught;
    }

    public void setModuleTaught(String moduleTaught) {
        this.moduleTaught = moduleTaught;
    }

    public Tutor(String name, String email, int age, int officeNumber, String moduleTaught ) {
        setName(name);
        setEmail(email);
        setAge(age);
        setOfficeNumber(officeNumber);
        setModuleTaught(moduleTaught);

    }
}
