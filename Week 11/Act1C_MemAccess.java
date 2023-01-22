class Lamp { // Class named 'Lamp'

    // Stores the value for light
    // True if light is on
    // False if light is off
    private boolean isOn; /* Is on Variable | bln = T or F? */

    // ** Method ** - To turn on light
    public void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    // ** Method ** - To turn off light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

class Main1 {
    public static void main(String[] args) {

        // Created Two Objects - led and halogen of the 'Lamp Class'
        // These objects are used to call the methods of the class | I.e. 'Lamp'
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // return on the light by
        // calling ** method turnOn() **
        led.turnOn();

        // turn off the light by
        // calling ** method turnOff() **
        halogen.turnOff();
    }
}

/* The variable isOn defined inside the class is also called an instance variable.
It is because when we create an object of the class, called an instance of the class.
And, each instance will have its own copy of the variable.
 */