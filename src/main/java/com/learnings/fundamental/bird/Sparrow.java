package com.learnings.fundamental.bird;

public class Sparrow extends Bird{
    public Sparrow(String name, double weight, BirdType birdType, Colour birdColor, Size birdSize) {
        super(name, weight, birdType, birdColor, birdSize);
    }
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
