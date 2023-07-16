package CReateCAr;

public class Vehicle {
    private int wheels;
    private String size;
    private String color;

    public Vehicle(int wheels, String size, String color) {
        this.wheels = wheels;
        this.size = size;
        this.color = color;
    }

    public void driveVehicle(){
        System.out.println("Vehicle of " + wheels + " " + size + " " + color);
    }

}
