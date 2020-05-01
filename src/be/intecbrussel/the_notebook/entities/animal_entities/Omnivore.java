package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.*;
import java.util.*;

public class Omnivore extends Animal {

    /** Variable containing the diet of this animal */
    private Set<Plant> plantDiet;
    /** Variable containing the maximum size of this animal's food */
    private double maxFoodSize;

    /**
     * Initialise a new Omnivore object with given parameters
     * @param name
     *          The name of the new Omnivore object
     */
    public Omnivore(String name){
        super(name);
    }

    /**
     * Initialise a new Omnivore object with the given parameters
     * @param name
     *          The name of the new Omnivore object
     * @param weight
     *          The weight of the new Omnivore object
     * @param height
     *          The height of the new Omnivore object
     * @param length
     *          The length of the new Omnivore object
     */
    public Omnivore(String name, double weight, double height, double length){
        super(name, weight, height, length);
    }

    /**
     * Getter for the plantDiet variable
     * @return  The plant diet of this omnivore object
     */
    public Set<Plant> getPlantDiet(){
        return this.plantDiet;
    }

    /**
     *
     * @param newPlantDiet
     */
    public void setPlantDiet(Set<Plant> newPlantDiet){
        this.plantDiet = newPlantDiet;
    }

    /**
     * Getter for the maximum size of this animal's food
     * @return  The maximum size of this animal's food
     */
    public double getMaxFoodSize(){
        return this.maxFoodSize;
    }

    /**
     * Setter for the maximum size of this animal's food
     * @param newMaxFoodSize
     *          The new maximum size of this animal's food
     */
    public void setMaxFoodSize(double newMaxFoodSize){
        this.maxFoodSize = newMaxFoodSize;
    }

    /**
     * Method that adds a new plant to this animal's plant diet
     * @param newPlant
     *          The new plant to be added to this animal's diet
     */
    public void addPlantToDiet(Plant newPlant){
        this.getPlantDiet().add(newPlant);
    }

    public String toString(){
        return this.getName() + " is an omnivore animal.";
    }

}
