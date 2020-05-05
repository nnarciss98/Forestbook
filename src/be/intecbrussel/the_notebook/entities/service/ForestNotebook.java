package be.intecbrussel.the_notebook.entities.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.*;

public class ForestNotebook {

    //TODO Gebruik altijd de List interface die hoger is in hierarchie ipv de implementeerde klasse
    //
    /** Variable containing a list of all seen carnivore animals */
    private ArrayList<Carnivore> carnivores = new ArrayList<Carnivore>();
    /** Variable containing a list of all seen omnivore animals */
    private ArrayList<Omnivore> omnivores = new ArrayList<Omnivore>();
    /** Variable containing a list of all seen herbivore animals */
    private ArrayList<Herbivore> herbivores = new ArrayList<Herbivore>();
    /** Variable containing the total number of seen plants */
    private int plantCount = 0;
    /** Variable containing the total number of seen animals */
    private int animalCount = 0;
    /** Variable containing a list of all seen animals */
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    /** Variable containing a list of all seen plants */
    private ArrayList<Plant> plants = new ArrayList<Plant>();

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
    //TODO hier kon je de size() van u lijst terug geven,
    // dan moet je niet in addPlant() de incrementatie doen ;)
    // zie voorbeeld
    public int getPlantCount(){
    //TODO plantCount = plants.size();
        return this.plantCount;
    }

    /**
     * Setter for the plantCount variable
     * @param newCount
     *          New number of plants that have been seen
     */
    public void setPlantCount(int newCount){
        this.plantCount = newCount;
    }

    /**
     * Getter for the animalCount variable
     * @return  Total number of animals that have been seen
     */
    //TODO hetzelfde zoals bij getPlantCount
    public int getAnimalCount(){
        return this.animalCount;
    }

    /**
     * Setter for the animalCount variable
     * @param newCount
     *          New number of animals that have been seen
     */
    public void setAnimalCount(int newCount){
        this.animalCount = newCount;
    }

    /**
     * Method that will add an animal to the list of already seen animals, if the animal hasn't been seen yet
     * @param animal
     *          The animal to be added to the list of animals that have already been seen
     *
     *      | if !animals.contains(animal)
     *      |       if (animal == carnivore)
     *      |           then carnivores.add(animal)
     *      |       if (animal == herbivore)
     *      |           then herbivores.add(animal)
     *      |       else
     *      |           omnivores.add(animal)
     *      |       animalCount += 1
     */
    public void addAnimal(Animal animal){
        if (!this.getAnimals().contains(animal)){
            this.getAnimals().add(animal);
            if (animal instanceof Herbivore){
                this.getHerbivores().add((Herbivore)animal);
            }
            else if (animal instanceof Carnivore){
                this.getCarnivores().add((Carnivore)animal);
            }
            else {
                this.getOmnivores().add((Omnivore)animal);
            }
            //TODO dit mag je weglaten indien je de getAnimalCount() anders implementeerd
            this.setAnimalCount(this.getAnimalCount() + 1);
        }
    }

    /**
     * Method that adds a plant to the list of plants that have already been seen, if the plant hasn't been seen yet
     * @param plant
     *          Plant to be added to the list of plants that have already been seen
     */
    public void addPlant(Plant plant) {
        if (!this.getPlants().contains(plant)) {
            this.getPlants().add(plant);
            this.setPlantCount(this.getPlantCount() + 1);
        }
    }

    /**
     * Method that prints out all elements in the notebook
     */
    public void printNotebook(){
        System.out.println("ForestNotebook:");
        System.out.println("Plants: ");
        //TODO this.getPlants().forEach(System.out::println);
        this.getPlants().forEach((Plant plant) -> System.out.println(plant.toString()));
        System.out.println("Animals: ");
        this.getAnimals().forEach((Animal animal) -> System.out.println(animal.toString()));
    }

    public void printCarnivores(){
        System.out.println("Carnivore animals: ");
        this.getCarnivores().forEach((Carnivore carnivore) -> System.out.println(carnivore.toString()));
    }

    public void printOmnivores(){
        System.out.println("Omnivore animals animals: ");
        this.getOmnivores().forEach((Omnivore omnivore) -> System.out.println(omnivore.toString()));
    }

    public void printHerbivores(){
        System.out.println("Herbivore animals: ");
        this.getHerbivores().forEach((Herbivore herbivore) -> System.out.println(herbivore.toString()));
    }

    /**
     * Method that sorts the animals, that have been seen, alphabetically by their name
     */
    //TODO goed gedaan maar je kan ook  de comparing() van de Comparator interface en method reference gebruiken
    //         this.getAnimals().sort(Comparator.comparing(Animal::getName));
    //
    public void sortAnimalsByName(){
        this.getAnimals().sort((Animal animal1, Animal animal2) -> animal1.getName().compareTo(animal2.getName()));
    }

    /**
     * Method that sorts the plants, that have been seen, alphabetically by their name
     */
    public void sortPlantsByName(){
        this.getPlants().sort((Plant plant1, Plant plant2) -> plant1.getName().compareTo(plant2.getName()));
    }

    /**
     * Method that sorts the animals that have been seen by their height
     */
    public void sortAnimalsByHeight(){
        this.getAnimals().sort((Animal animal1, Animal animal2) -> (int)(animal1.getHeight() - animal2.getHeight()));
    }

    /**
     * Method that sorts the plants that have been seen by their height
     */
    public void sortPlantsByHeight(){
        this.getPlants().sort((Plant plant1, Plant plant2) -> (int)(plant1.getHeight() - plant2.getHeight()));
    }
}