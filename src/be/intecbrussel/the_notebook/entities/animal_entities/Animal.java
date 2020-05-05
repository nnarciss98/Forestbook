package be.intecbrussel.the_notebook.entities.animal_entities;

public class Animal {

    /** Variable containing the name of this animal */
    protected String name;
    /** Variable containing the weight of this animal */
    protected double weight;
    /** Variable containing the height of this animal */
    protected double height;
    /** Variable containing the length of this animal */
    protected double length;

    /**
     * Initialise a new Animal object with given parameters
     * @param name
     *          The name of this new instance of Animal
     */
    public Animal(String name){
        this.name = name;
    }

    /**
     * Initialise a new Animal object with given parameters
     * @param name
     *          The name of this enw instance of Animal
     * @param weight
     *          The weight of this new instance of Animal
     * @param height
     *          The height of this new instance of Animal
     * @param length
     *          The length of this new instance of Animal
     */
    public Animal(String name, double weight, double height, double length){
        this.name = name;
        this.weight = weight;
        this. height = height;
        this.length = length;
    }

    /**
     * Getter for the name variable
     * @return  The name of this Animal
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter for the weight variable
     * @return  The weight of this animal in kg
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * Setter for the weight variable
     * @param newWeight
     *          The new weight of this animal
     */
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    /**
     * Getter for the height variable
     * @return  The height of this animal in cm
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * Setter for the height variable
     * @param newHeight
     *          The new height of this animal
     */
    public void setHeight(double newHeight){
        this.height = newHeight;
    }

    /**
     * Getter for the length variable
     * @return  The length of this animal in m
     */
    public double getLength(){
        return this.length;
    }

    /**
     * Setter for the length variable
     * @param newLength
     *          The new length of this animal
     */
    public void setLength(double newLength){
        this.length = newLength;
    }

    //TODO ik zou in deze klasse al een toString() voorzien en dan in je subklassen die oproepen
    // maak gebruik van de kracht van inheritance
    // klein voorbeeld hieronder en in de carnivore klasse
    // getClass().getSimpleName() dit geeft de juiste naam terug van de klasse at runtime
    //  @Override
    // public String toString() {
    //    return String.format("%s name='%s', weight=%s, height=%s, length=%s}", getClass().getSimpleName(), name, weight, height, length);
    // }
}
