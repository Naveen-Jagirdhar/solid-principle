package com.learnings.fundamental.bird;

public class Runner {
    public static void main(String[] args) {
        Bird eagle = new Eagle("Eagle",32.2,BirdType.EAGLE,Colour.BLACK,Size.LARGE);
        Bird sparrow = new Sparrow("Sparrow",32.2,BirdType.SPARROW,Colour.BLACK,Size.SMALL);
        eagle.fly();
        sparrow.fly();
    }
}
