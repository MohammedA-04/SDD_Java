import java.util.Random;
public class W28_VariableScope_DiceRoller {

    // Variable are GLOBAL NOW in COMMENT they are LOCAL via passing ARG'S
    Random random;
    int number = 0;
    W28_VariableScope_DiceRoller() {
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
   /*
        W28_VariableScope_DiceRoller(){     // Constructor  === Method  :)

        Random random = new Random();   // Random object imported named 'random'
        int number = 0;                 // Number has a Value of 0
        roll(random,number);            // Calling the 'roll' method
        // Passing Random and Number into our roll method
    }

    void roll(Random random,int number){     // Parameter it'll accept
        number = random.nextInt(6)+1; // Action in Method // What to do with variable 'number'
        // round has range of 6
        System.out.println(number);         // Printing Number

    }
    */

