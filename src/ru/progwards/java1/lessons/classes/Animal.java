package ru.progwards.java1.lessons.classes;

class Animal{

    double weight;
    double foodCoeff;

    public Animal(double weight)
    {
        this.weight = weight;

    }


    enum AnimalKind
    {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK
    }

    enum FoodKind
    {
        UNKNOWN,
        HAY,
        CORN
    }

    public double getWeight()
    {
     return weight;
    }

    public AnimalKind getKind()
    {
       return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind()
    {
        return FoodKind.UNKNOWN;
    }

    public double getFoodCoeff()
    {
        foodCoeff = 0.02;
        return foodCoeff;
    }

    public double calculateFoodWeight()
    {
        return getWeight() * getFoodCoeff();
    }

    public String toString()
    {
       return "I am " +  getKind() + ", " + "eat " +  getFoodKind();
    }

    public String toStringFull()
    {
        return "I am " +  getKind() + ", " + "eat " +  getFoodKind() + " " + calculateFoodWeight();
    }

    public static void main(String[] args) {
        Animal animal = new Animal(300);
        System.out.println(animal);


    }
}

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
        foodCoeff = 0.05;
        return foodCoeff;
    }



    public static void main(String[] args) {
        Cow animal  = new Cow(500);
        System.out.println(animal);

    }

}

class Hamster extends Animal{

    Hamster(double weight)
    {
        super(weight);
    }

    public AnimalKind getKind()
    {
        return AnimalKind.HAMSTER;
    }

    public FoodKind getFoodKind()
    {
        return FoodKind.CORN;
    }

    public double getFoodCoeff()
    {
        foodCoeff = 0.03;
        return foodCoeff;
    }



    public static void main(String[] args) {
        Hamster animal  = new Hamster(100);
        System.out.println(animal);

    }
}

class Duck extends Animal{

    Duck(double weight)
    {
        super(weight);
    }

    public AnimalKind getKind()
    {
        return AnimalKind.DUCK;
    }

    public FoodKind getFoodKind()
    {
        return FoodKind.CORN;
    }

    public double getFoodCoeff()
    {
        foodCoeff = 0.04;
        return foodCoeff;
    }



    public static void main(String[] args) {
        Duck animal  = new Duck(10);
        System.out.println(animal);

    }
}


class ComplexNum {

    int a;
    int b;
    int c;
    int d;

    public ComplexNum(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public String toString()
    {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num)
    {
        return new ComplexNum(a + num.a,b + num.b);
    }

    public ComplexNum sub(ComplexNum num)
    {
        return new ComplexNum(a - num.a,b - num.b);
    }

    public ComplexNum mul(ComplexNum num)
    {
        return new ComplexNum(a * num.a - b * num.b,b * num.b + a * num.a);
    }

    public ComplexNum div(ComplexNum num)
    {
        
        return new ComplexNum((a * num.a + b * num.b) / (num.a * num.a + num.b * num.b),(b * num.a - a * num.b) / (num.a * num.a + num.b * num.b));

    }


    public static void main(String[] args)
    {
        System.out.println (new ComplexNum(1, 1).add(new ComplexNum(99, 99)).toString());
        System.out.println (new ComplexNum(99, 99).sub(new ComplexNum(1, 1)).toString());
        System.out.println (new ComplexNum(1, 1).mul(new ComplexNum(99, 99)).toString());
        System.out.println (new ComplexNum(99, 99).div(new ComplexNum(1, 1)).toString());
    }
}