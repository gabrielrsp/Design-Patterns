package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;

    private Singleton(){ }

    public static Singleton getInstance(){

        if(firstInstance == null){

                System.out.println("Creating Instance");

                firstInstance = new Singleton();

        }

        return  firstInstance;
    }

}
