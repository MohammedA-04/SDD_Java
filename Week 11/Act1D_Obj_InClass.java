class LampNew {
// stores the value for light
// true if light is on
// false if light is off

private boolean isOn;
// method to turn on the light

public void turnOn()
    {
    isOn = true;
    System.out.println("Light on? " + isOn);
    }
public static void main(String[] args)
    {
    // Create an object of Lamp
    LampNew led = new LampNew();

    // access method using object
    led.turnOn();
    }
}

