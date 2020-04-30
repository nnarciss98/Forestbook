package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant{

    /* Variables containing the type of fruit and leaf this bush has */
    private String fruit;
    private LeafType leafType;

    public Bush(String name){
        super(name);
    }

    public Bush(String name, double height){
        super(name, height);
    }

    public String getFruit(){
        return this.fruit;
    }

    public void setFruit(String newFruit){
        this.fruit = newFruit;
    }

    public LeafType getLeafType(){
        return this.leafType;
    }

    public void setLeafType(LeafType newLeafType){
        this.leafType = newLeafType;
    }

    public String toString(){
        String returnString = "This is a " + this.getName() + " plant, with " + this.getFruit() + " fruit, has a height of " + Double.toString(this.getHeight()) + " and a " + this.getLeafType() + " leaf type.";
        return returnString;
    }
}
