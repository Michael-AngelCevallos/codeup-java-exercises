package MyLessons.Encapsulation;

// Private variables/attributes( below) make it so that they can only be accessed from this class  <--------


public class Cars {

    private String make;
    private String model;
    private int year;


    /** CONSTRUCTOR */
    Cars(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }

    /** Getter Method- sends private variable to a class that calls upon variable */

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
}
