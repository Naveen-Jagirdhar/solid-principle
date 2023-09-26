package com.learnings.fundamental.bird;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Flyable eagle = new Eagle("Eagle",32.2,BirdType.EAGLE,Colour.BLACK,Size.LARGE);
        Flyable sparrow = new Sparrow("Sparrow",32.2,BirdType.SPARROW,Colour.BLACK,Size.SMALL);
        Penguin penguin = new Penguin("Penguin",32.2,BirdType.PENGUIN,Colour.BLACK,Size.SMALL);
        flyAll(List.of(eagle,sparrow));
    }

    static void flyAll(List<Flyable> flyableList) {
        flyableList.forEach(Flyable::fly);
    }
}
