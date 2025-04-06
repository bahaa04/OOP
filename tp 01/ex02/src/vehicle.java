public class vehicle {
    protected String model;
    private int year;

    public vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayInfo(int mileage){
        System.out.printf("the model of this car is %S made in %d and with a mileage %d",model,year,mileage);
    }

    public void displayInfo(){
        System.out.printf("the model of this car is %S",model);
    }
}
