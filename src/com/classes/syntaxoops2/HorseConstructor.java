package com.classes.syntaxoops2;

public class HorseConstructor {
        private String name;
        private int age;
        private double weight;
        private int legs;

        HorseConstructor(String horseName,int horseAge,double horseWeight){
            name=horseName;
            age=horseAge;
            weight=horseWeight;
        }

    HorseConstructor(String horseName,int horseAge,double horseWeight,int horseLegs){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
        legs=horseLegs;
    }

        void printHorseName(){
            System.out.println("Name "+name);
        }



    
}
