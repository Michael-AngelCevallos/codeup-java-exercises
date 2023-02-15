package oop;






public class Car {

    private String make;
    private String model;
    private int VIN;
    private int numberOfSeats;
    private boolean hasStyle;

    /** GETTERS - gatekeepers to ACCESS the value */

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }



    /**SETTERS - gatekeepers method for CHANGING value. needs to be ----->> void */

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }



}
