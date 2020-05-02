package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    /** Variable containing the area of the weed*/
    private double area;

    /**
     * Initialise a new Weed object with given name
     * @param name
     *          The name of the new weed object
     */
    public Weed(String name){
        super(name);
    }

    /**
     * Initialise a new Plant object with given name and height
     * @param name
     *          The name of the new weed object
     * @param height
     *          The height of the new weed object
     */
    public Weed(String name, double height){
        super(name, height);
    }

    /**
     * Getter for the area variable
     * @return  The area of this weed object
     */
    public double getArea(){
        return this.area;
    }

    /**
     * Setter for the area variable
     * @param newArea
     *          The new area of this weed object
     */
    public void setArea(double newArea){
        this.area = newArea;
    }

    public String toString(){
        return "Name: " + this.getName() + ".\tHeight: " + this.getHeight() + "cm.\tArea: " + this.getArea() + "m².\tThis is a weed.\n";
    }

}
