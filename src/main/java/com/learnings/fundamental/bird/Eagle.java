package com.learnings.fundamental.bird;

public class Eagle extends Bird{
    public Eagle(String name, double weight, BirdType birdType, Colour birdColor, Size birdSize) {
        super(name, weight, birdType, birdColor, birdSize);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
