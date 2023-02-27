package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private  int numberOfPaws;
    private  boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    String getDescription() {
        String paw = numberOfPaws == 1 ? "paw" : "paws";
        String furArticle = hasFur ? "a" : "no";
        return "This animal is mostly " + color + "."
                 + " It has " + numberOfPaws + " " + paw + " and " + furArticle + " fur.";
    }

    public static void main(String[] args) {
        Dog testDog = new Dog();
        Bird testBird = new Bird();
        System.out.println(testDog.getDescription());
        System.out.println(testBird.getDescription());
    }
}
