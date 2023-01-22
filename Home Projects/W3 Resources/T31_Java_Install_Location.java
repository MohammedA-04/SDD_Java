// Write a Java program to check whether Java is installed on your computer - EASY
public class T31_Java_Install_Location // Exercise 38 Basic Pt1
{
    public static void main(String[] args)
    { // Main Method
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path")+"\n");
    }
}

