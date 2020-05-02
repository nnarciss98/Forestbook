package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant{

    /** Variable containing the leafType of this tree */
    private LeafType leafType;

    /**
     * Initialise a new Tree object with given name
     * @param name
     *          The name of the new tree object
     */
    public Tree(String name){
        super(name);
    }

    /**
     * Initialise a new Tree object with given name and height
     * @param name
     *          The name of the new tree object
     * @param height
     *          The height of the new tree object
     */
    public Tree(String name, double height){
        super(name, height);
    }

    /**
     * Getter for the leafType variable
     * @return  The leaf type of this tree
     */
    public LeafType getLeafType(){
        return this.leafType;
    }

    /**
     * Setter for the leafType variable
     * @param newLeafType
     *              The leafType this tree will have from now on
     */
    public void setLeafType(LeafType newLeafType){
        this.leafType = newLeafType;
    }

    public String toString(){
        return "Name: " + this.getName() + ".\tHeight: " + this.getHeight() + "cm.\tLeaf type: " + this.getLeafType() + ".\tThis is a tree.\n";
    }
}
