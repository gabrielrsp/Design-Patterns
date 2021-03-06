package creationalPatterns.prototype;

public class Sheep implements Animal {

    public Sheep(){

        System.out.println("Sheep is made");

    }

    public Animal makeCopy(){

        System.out.println("Sheep is been made");

        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;

    }

    public String toString(){
        return "Dolly is a clone";
    }

}
