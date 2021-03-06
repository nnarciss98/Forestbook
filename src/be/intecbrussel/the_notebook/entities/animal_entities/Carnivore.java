package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    /** Variable containing the maximum size of this animal's prey */
    private double maxFoodSize;

    /**
     * Initialise a new Carnivore object with the given parameters
     * @param name
     *          The name of the carnivore object
     */
    public Carnivore(String name){
        super(name);
    }

    /**
     * Initialise a new Carnivore object with the given parameters
     * @param name
     *          The name of the carnivore object
     * @param weight
     *          The weight of the carnivore object
     * @param height
     *          The height of the carnivore object
     * @param length
     *          The length of the carnivore object
     */
    public Carnivore(String name, double weight, double height, double length){
        super(name, weight, height, length);
    }

    /**
     * Getter for the maxFoodSize variable
     * @return  The value of the maximum size of the prey
     */
    public double getMaxFoodSize(){
        return this.maxFoodSize;
    }

    /**
     * Setter for the maximum size of prey
     * @param newMaxFoodSize
     *          The new maximum size of prey
     */
    public void setMaxFoodSize(double newMaxFoodSize) {
        this.maxFoodSize = newMaxFoodSize;
    }

    public String toString(){
        return "Name: " + this.getName() + ".\tWeight: " + this.getWeight() + "kg.\tHeight: " + this.getHeight() + "cm.\tLength: " + this.getLength() + "m.\tThis is a carnivore animal.\n";
    }

    //TODO dus indien je de toString zou implementeren in Animal, ziet er je toString() er zo uit
    // @Override
    // public String toString() {
    //    return String.format("%s maxFoodSize=%s", super.toString(), maxFoodSize);
    // }
}
