class Student
{
String name1;
int roll_no;
}

class Ans
    {
        public static void main(String[] args)
        {
           Student s = new Student();
           s.name1 = "John";
           s.roll_no = 2;
           System.out.println("Name is " + s.name1 + " and Role Num is " + s.roll_no);
        }
    }