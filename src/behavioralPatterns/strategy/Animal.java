package behavioralPatterns.strategy;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;


    public Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        if(newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public String tryToFly(){

        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){

        flyingType = newFlyType;

        }

    }


