class Bulb {
  boolean isOn;
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);
  }

  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}

class Electric {
  public static void main(String[] args) {
    Bulb led = new Bulb();
    Bulb halogen = new Bulb();
    led.turnOn();
    halogen.turnOff();
  }
}
