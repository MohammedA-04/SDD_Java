package Java_Week.Java_Week_19.Example_Enum_1;

public class EnumTut { // Main Class

    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        if (day == DaysOfTheWeek.THURSDAY){

            System.out.println("Yay its nearly Friday");
        }

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            System.out.println(myDay);
        }

    }



}

// Built in extend so no need to extends as already in there