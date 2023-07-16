package CReateCAr;

public class MAin {
    public static void main(String[] args) {
       // Vehicle v = new Vehicle();
//        v.setWheels(4);
//        v.setColor("Red");
//        v.setSize("Big");
       // v.driveVehicle();

//        Car c = new Car();
//        c.setColor("BLack");
//        c.setSize("Small");
//        c.setWheels(4);
//        c.setEV(false);
//        c.driveVehicle();

        Car c = new Car(4,"Small", "Pink", true);
        c.driveVehicle();

        Object o = new Car(3,"s", "h", true);
    }
}
