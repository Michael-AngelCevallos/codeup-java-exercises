package MyLessons.Encapsulation2;

public class Car {

    private String make;
    private String model;
    private int year;

/** constructor */
    public Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    // used for car3 example ( works bec ause we already made a copy method below) <-----------
    Car(Car x){
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // copy method ( allows us to use .copy) to pass over a instances info into another without changing its address
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
