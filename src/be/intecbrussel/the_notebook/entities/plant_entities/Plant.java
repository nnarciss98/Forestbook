package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {

    /* Variables containing the name and height of the plant objects */
    private String name;
    private double height;

    /**
     * Initialise a new Plant object with given name
     * @param name
     *          The name of the new plant object
     */
    public Plant(String name){
        this.name = name;
    }

    /**
     * Initialise a new Plant object with given name and height
     * @param name
     *          The name of the new plant object
     * @param height
     *          The height of the new plant object
     */
    public Plant(String name, double height){
        this.name = name;
        this.height = height;
    }

    /**
     * Getter for the name variable
     * @return  The name of this object
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter for the height variable
     * @return  The height of this object
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * Setter for the height variable
     * @param newHeight
     *              The new height of this object
     */
    public void setHeight(double newHeight){
        this.height = newHeight;
    }

}
