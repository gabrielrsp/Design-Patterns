package estruturalPatterns.decorator;

public class Mozzarela extends ToppingDecorator {
    public Mozzarela(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Mozzarela");

    }

    public String getDescription(){

        return tempPizza.getDescription() + ", Mozzarela";

    }

    public double getCost() {

        return tempPizza.getCost() + .50;

    }


}
