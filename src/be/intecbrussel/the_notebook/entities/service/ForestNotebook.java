package be.intecbrussel.the_notebook.entities.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.*;

public class ForestNotebook {

    /** Variable containing a list of all seen carnivore animals */
    private ArrayList<Carnivore> carnivores;
    /** Variable containing a list of all seen omnivore animals */
    private ArrayList<Omnivore> omnivores;
    /** Variable containing a list of all seen herbivore animals */
    private ArrayList<Herbivore> herbivores;
    /** Variable containing the total number of seen plants */
    private int plantCount;
    /** Variable containing the total number of seen animals */
    private int animalCount;
    /** Variable containing a list of all seen animals */
    private ArrayList<Animal> animals;
    /** Variable containing a list of all seen plants */
    private ArrayList<Plant> plants;

    /**
     * Default constructor
     */
    public ForestNotebook(){}

    /**
     * Getter for the carnivores variable
     * @return  A list of all carnivore animals that have been seen
     */
    public ArrayList<Carnivore> getCarnivores(){
        return this.carnivores;
    }

    /**
     * Setter for the carnivores variable
     * @param carnivoresList
     *          The new list of the carnivore animals that have been seen
     */
    public void setCarnivores(ArrayList<Carnivore> carnivoresList){
        this.carnivores = carnivoresList;
    }

    /**
     * Getter for the omnivores variable
     * @return  A list of all omnivore animals that have been seen
     */
    public ArrayList<Omnivore> getOmnivores(){
        return this.omnivores;
    }

    /**
     * Setter for the omnivores variable
     * @param omnivoresList
     *          The new list of the omnivore animals that have been seen
     */
    public void setOmnivores(ArrayList<Omnivore> omnivoresList){
        this.omnivores = omnivoresList;
    }

    /**
     * Getter for the herbivores variable
     * @return  A list of all herbivore animals that have been seen
     */
    public ArrayList<Herbivore> getHerbivores(){
        return this.herbivores;
    }

    /**
     * Setter for the herbivores variable
     * @param herbivoresList
     *          The new list of the herbivore animals that have been seen
     */
    public void setHerbivores(ArrayList<Herbivore> herbivoresList){
        this.herbivores = herbivoresList;
    }

    /**
     * Getter for the animals variable
     * @return  A list of all the animals that have been seen
     */
    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }

    /**
     * Getter for the plants variable
     * @return  A list of all the plants that have been seen
     */
    public ArrayList<Plant> getPlants(){
        return this.plants;
    }

    /**
     * Getter for the plantCount variable
     * @return  Total number of plants that have been seen
     */
    public int getPlantCount(){
        return this.plantCount;
    }

    /**
     * Getter for the animalCount variable
     * @return  Total number of animals that have been seen
     */
    public int getAnimalCount(){
        return this.animalCount;
    }

    /**
     * Method that will add an animal to the list of already seen animals
     * @param animal
     *          The animal to be added to the list of animals that have already been seen
     *
     *      | if (animal == carnivore)
     *      |       then carnivores.add(animal)
     *      | if (animal == herbivore)
     *      |       then herbivores.add(animal)
     *      | else
     *      |       omnivores.add(animal)
     */
    public void addAnimal(Animal animal){
        if (animal instanceof Carnivore){
            this.getCarnivores().add((Carnivore)animal);
        }
        else if (animal instanceof Herbivore){
            this.getHerbivores().add((Herbivore)animal);
        }
        else {
            this.getOmnivores().add((Omnivore)animal);
        }
        this.getAnimals().add(animal);
    }

    /**
     * Method that adds a plant to the list of plants that have already been seen
     * @param plant
     *          Plant to be added to the list of plants that have already been seen
     */
    public void addPlant(Plant plant){
        this.getPlants().add(plant);
    }

    public void printNotebook(){

    }

    /**
     * Method that sorts the animals, that have been seen, alphabetically by their name
     */
    public void sortAnimalsByName(){
        this.getAnimals().sort((Animal animal1, Animal animal2) -> animal1.getName().compareTo(animal2.getName()));
    }

    /**
     * Method that sorts the plants, that have been seen, alphabetically by their name
     */
    public void sortPlantsByName(){
        this.getPlants().sort((Plant plant1, Plant plant2) -> plant1.getName().compareTo(plant2.getName()));
    }
}