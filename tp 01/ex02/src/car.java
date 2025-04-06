public class car extends vehicle{

    private int fuelEfficiency;

    public car(String model, int year,int fuelEfficiency) {
        super(model, year);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\nthis car fuel efficiency is %d",fuelEfficiency);
    }

    
    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void calculateFuelConsumption(){
        System.out.printf("the fuel consumption is %d",fuelEfficiency/100);
    }
}
