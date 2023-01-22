public class W28_VariableScope {

    // Local  = Declared inside a method
    //        = Only visible to that method

    // Global = Declared outside a method, but within a class
    //        = Visible to all parts of a class
    public static void main(String[] args) {
    W28_VariableScope_DiceRoller diceroller = new W28_VariableScope_DiceRoller();
    }
}

/* Notes - Variable Scope

Global Variable = Visible to all but placed outside a method
Local Variable = Are local to a method and only visible by method
 */