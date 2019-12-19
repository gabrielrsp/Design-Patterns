package creationalPatterns.factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main (String[] args){

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type Ship? (U / R / B)");

        if(userInput.hasNextLine()){
            String typeofShip = userInput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeofShip);

        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);

        } else System.out.println("Enter a U, R, or B next time");
        

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }

}

