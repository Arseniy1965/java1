package ru.progwards.java1.lessons.interfaces;

class Cow extends Animal{

    Cow(double weight)
    {
        super(weight);
    }


    public AnimalKind getKind()
    {
        return AnimalKind.COW;
    }

    public FoodKind getFoodKind()
    {
        return FoodKind.HAY;
    }

    public double getFoodCoeff()
    {
        double foodCoeff = 0.05;
        return foodCoeff;
    }

}
