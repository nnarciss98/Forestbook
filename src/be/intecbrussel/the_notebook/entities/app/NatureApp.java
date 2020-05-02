package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.service.ForestNotebook;
import java.util.*;

public class NatureApp {

    public static void main(String[] args){

        // We create a new instance of ForestNotebook
        ForestNotebook forestNotebook = new ForestNotebook();

        // We proceed to create new instances of plants that we have seen
        Tree pine = new Tree("Pine", 30.5);
        pine.setLeafType(LeafType.NEEDLE);

        Flower narcissus = new Flower("Narcissus", 0.8);
        narcissus.setSmell(Scent.SWEET);

        Flower hibiscus = new Flower("Hibiscus", 3.05);
        hibiscus.setSmell(Scent.PINEAPPLE);

        Weed cannabis = new Weed("Cannabis", 0.38);
        cannabis.setArea(0.8);

        Bush raspberry = new Bush("Raspberry", 1.27);
        raspberry.setFruit("Raspberry");
        // We add the new plants that we have seen to the plant list of the notebook
        forestNotebook.addPlant(pine);
        forestNotebook.addPlant(narcissus);
        forestNotebook.addPlant(hibiscus);
        forestNotebook.addPlant(cannabis);
        forestNotebook.addPlant(raspberry);

        // We proceed to create new instances of animals that have been seen

        //Carnivore animals
        Carnivore tiger = new Carnivore("Joe Exotic", 200, 120, 2.5);
        tiger.setMaxFoodSize(2);

        Carnivore lion = new Carnivore("Lion", 250, 150, 2.5);
        lion.setMaxFoodSize(1.8);

        Carnivore wolf = new Carnivore("Wolverine", 80, 80, 1.8);
        wolf.setMaxFoodSize(1.8);

        // We create a plantSet to be used in the plantDiet of the herbivore and omnivore animals
        Set<Plant> plantSet = new HashSet<>();
        plantSet.add(cannabis);
        plantSet.add(new Weed("Grass", 0.5));

        //Herbivore animals
        Herbivore cow = new Herbivore("Cow", 900, 170, 2.3);
        cow.setPlantDiet(plantSet);

        Herbivore horse = new Herbivore("Horse", 500, 180, 2.4);
        horse.setPlantDiet(plantSet);

        Herbivore zebra = new Herbivore("Zebra", 400, 150, 2.4);
        zebra.setPlantDiet(plantSet);

        //Omnivore animals
        Omnivore pig = new Omnivore("Peppa pig", 350, 100, 1.5);
        pig.setMaxFoodSize(1);
        pig.setPlantDiet(plantSet);

        Omnivore bear = new Omnivore("Bear", 400, 180, 2);
        bear.setPlantDiet(plantSet);
        bear.setMaxFoodSize(2);

        Omnivore rhino = new Omnivore("Rhino", 2300,180, 3.5);
        rhino.setPlantDiet(plantSet);
        rhino.setMaxFoodSize(2);

        // We proceed to add the animals to the notebook
        forestNotebook.addAnimal(tiger);
        forestNotebook.addAnimal(lion);
        forestNotebook.addAnimal(wolf);
        forestNotebook.addAnimal(cow);
        forestNotebook.addAnimal(horse);
        forestNotebook.addAnimal(zebra);
        forestNotebook.addAnimal(pig);
        forestNotebook.addAnimal(bear);
        forestNotebook.addAnimal(rhino);

        // Print the number of plants and animals that have been seen
        System.out.println("You have seen " + forestNotebook.getPlantCount() + " plants, and " + forestNotebook.getAnimalCount() + " animals.");

        // Print the not sorted list of all animals and plants that have been seen
        forestNotebook.printNotebook();

        // Print carnivore, herbivore and omnivore animals separately
        System.out.println("Print omnivore, carnivore and herbivore animals separately:");
        forestNotebook.printOmnivores();
        forestNotebook.printCarnivores();
        forestNotebook.printHerbivores();

        // Now we sort the list of animals and the list of plants by name
        System.out.println("Sorted animals and plants by name");
        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();

        // We print out the sorted lists using the printNotebook() method
        forestNotebook.printNotebook();

        // Now we sort again the lists, but this time by height
        System.out.println("Sorted animals and plants by height");

        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsByHeight();

        // And now we print them again, but now sorted by height
        forestNotebook.printNotebook();

        /*
         * Hope you like the code :)
         * If you don't... Well... It's all Patrick's fault \(u.u)/
         * Just to make it clear, I didn't document this class so indepth as the others,
         * because this is pretty straightforward.
         *
         * Stay healthy and safe :)
         *
         */

    }
}
