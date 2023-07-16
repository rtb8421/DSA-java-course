package CReateCAr;

public class Car extends Vehicle{
    private boolean isEV;

    public Car(int wheels, String size, String color, boolean isEV) {
        super(wheels, size, color);
        this.isEV = isEV;
    }


    @Override
    public void driveVehicle() {
        super.driveVehicle();
        if(isEV){
            System.out.println("This car is EV type");
        }else{
            System.out.println("This car is not EV type");
        }

    }
}
