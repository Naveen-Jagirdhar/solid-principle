package com.learnings.fundamental.bird;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Bird {

    private String name;
    private double weight;
    private BirdType birdType;
    private Colour birdColor;
    private  Size birdSize;
    public abstract void fly();
    public void eat() {
        System.out.println("Bird is eating");
    }
    public void sleep() {
        System.out.println("Bird is sleeping");
    }
}
