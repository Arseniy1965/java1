package ru.progwards.java1.lessons.interfaces;

class Hamster extends Animal {

    Hamster(double weight) {
        super(weight);
    }

    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    public double getFoodCoeff() {
        double foodCoeff = 0.03;
        return foodCoeff;
    }
}
