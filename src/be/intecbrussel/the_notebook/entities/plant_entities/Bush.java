package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant{

    /** Variables containing the type of fruit and leaf this bush has */
    private String fruit;
    private LeafType leafType;

    /**
     * Initialise a new Bush object with given name
     * @param name
     *          The name of the new bush object
     */
    public Bush(String name){
        super(name);
    }

    /**
     * Initialise a new Bush object with given name and height
     * @param name
     *          The name of the new bush object
     * @param height
     *          The height of the new bush object
     */
    public Bush(String name, double height){
        super(name, height);
    }

    /**
     * Getter for the fruit variable
     * @return  The type of fruit this bush has
     */
    public String getFruit(){
        return this.fruit;
    }

    /**
     * Setter for the fruit variable
     * @param newFruit
     *              The new fruit this bush will contain from now on
     */
    public void setFruit(String newFruit){
        this.fruit = newFruit;
    }

    /**
     * Getter for the leafType variable
     * @return  The type of leaf this bush has
     */
    public LeafType getLeafType(){
        return this.leafType;
    }

    /**
     * Setter for the leafType variable
     * @param newLeafType
     *              The new leafType this bush will have from now on
     */
    public void setLeafType(LeafType newLeafType){
        this.leafType = newLeafType;
    }

    public String toString(){
        return this.getName() + " is a plant of the type bush.";
    }
}
