package smarthome;

interface Controllable {
    void turnOn();
    void turnOff();
}

abstract class Appliance implements Controllable {
    private String id;
    private boolean isOn = false;
    private double power; // watts

    public Appliance(String id, double power) {
        this.id = id; this.power = power;
    }

    protected void setOn(boolean on) { this.isOn = on; }
    public boolean isOn() { return isOn; }
    public double getPower() { return power; }

    public abstract void turnOn();
    public abstract void turnOff();
}

class Light extends Appliance {
    public Light(String id, double power) { super(id, power); }
    @Override
    public void turnOn() { setOn(true); System.out.println("Light " + getPower() + "W turned on"); }
    @Override
    public void turnOff() { setOn(false); System.out.println("Light turned off"); }
}

class AC extends Appliance {
    private double temp;
    public AC(String id, double power, double temp) { super(id, power); this.temp = temp; }
    @Override
    public void turnOn() { setOn(true); System.out.println("AC set to " + temp + "C and turned on"); }
    @Override
    public void turnOff() { setOn(false); System.out.println("AC turned off"); }
}

class UserController {
    public void toggle(Controllable c, boolean on) {
        if (on) c.turnOn(); else c.turnOff();
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Light l = new Light("L1", 9);
        AC ac = new AC("AC1", 1500, 24);
        UserController uc = new UserController();
        uc.toggle(l, true);
        uc.toggle(ac, true);
    }
}
