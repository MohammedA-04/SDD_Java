public class Act2E_CheckNegorNo {
    public static void main(String[] args)
    {
        double number = 12.3;

        if (number < 0.0)
            System.out.println( number + " Negative Number");
        else if (number > 0.0)
            System.out.println(number + " Positive Number");
        else
        System.out.println(number + " Number is 0.");

    }
}

/*
* If a number is larger than 0  = Pos    // if statement
* If a number is smaller than 0 = Neg    // else if
* if a number is neither then 0.X = 0.?  // else
* */