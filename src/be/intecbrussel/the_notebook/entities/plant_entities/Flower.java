package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant{

    /** Variable containing the smell of the flower*/
    private Scent smell;

    /**
     * Initialise a new Flower object with given name
     * @param name
     *          The name of the new flower object
     */
    public Flower(String name){
        super(name);
    }

    /**
     * Initialise a new Flower object with given name and height
     * @param name
     *          The name of the new flower object
     * @param height
     *          The height of the new flower object
     */
    public Flower(String name, double height) {
        super(name, height);
    }

    /**
     * Getter for the smell variable
     * @return  The smell of this flower object
     */
    public Scent getSmell(){
        return  this.smell;
    }

    /**
     * Setter for the smell variable
     * @param newSmell
     *          The smell this flower will have from now on
     */
    public void setSmell(Scent newSmell){
        this.smell = newSmell;
    }

    public String toString(){
        return "Name: " + this.getName() + ".\tHeight: " + this.getHeight() + "cm.\tSmell: " + this.getSmell() + ".\tThis is a flower.\n";
    }
}
