package ru.progwards.java1.lessons.interfaces;

class Duck extends Animal {

    Duck(double weight) {
        super(weight);
    }

    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    public double getFoodCoeff() {
        double foodCoeff = 0.04;
        return foodCoeff;
    }
}
