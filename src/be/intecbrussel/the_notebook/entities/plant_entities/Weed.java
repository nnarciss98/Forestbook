package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    private double area;

    public Weed(String name){
        super(name);
    }

    public Weed(String name, double height){
        super(name, height);
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double newArea){
        this.area = newArea;
    }

    // TODO
    public String toString(){

        return null;
    }

}
