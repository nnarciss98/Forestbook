package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.*;
import java.util.*;

public class Herbivore extends Animal{

    /** Variable containing the diet of this animal */
    private Set<Plant> plantDiet;

    /**
     * Initialise a new Herbivore object with the given parameters
     * @param name
     *          The name of the herbivore animal
     */
    public Herbivore(String name){
        super(name);
    }

    /**
     * Initialise a new Herbivore object with the given parameters
     * @param name
     *          The name of the herbivore object
     * @param weight
     *          The weight of the herbivore object
     * @param height
     *          The height of the herbivore object
     * @param length
     *          The length of the herbivore object
     */
    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    /**
     * Getter for the plantDiet variable
     * @return  The set of plants this animal eats
     */
    public Set<Plant> getPlantDiet(){
        return this.plantDiet;
    }

    /**
     * Setter for the plant diet variable
     * @param newPlantDiet
     *          The new set of plants this animal eats
     */
    public void setPlantDiet(Set<Plant> newPlantDiet){
        this.plantDiet = newPlantDiet;
    }

    /**
     * This method adds a new plant to the diet of this animal
     * @param newPlant
     *          The new plant to be added to the diet
     */
    public void addPlantToDiet(Plant newPlant){
        this.getPlantDiet().add(newPlant);
    }

    /**
     * Method that prints the diet of this animal
     */
    public void printDiet(){
        System.out.println(this.getPlantDiet());
    }

    public String toString(){
        return this.getName() + " is an herbivore animal.";
    }
}
