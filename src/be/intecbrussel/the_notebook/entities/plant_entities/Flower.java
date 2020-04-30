package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant{

    private Scent smell;

    public Flower(String name){
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell(){
        return  this.smell;
    }

    public void setSmell(Scent newSmell){
        this.smell = newSmell;
    }

    // TODO
    public String toString(){
        return null;
    }
}
