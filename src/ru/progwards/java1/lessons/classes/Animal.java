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

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + "+" + b + "i";
    }


    public ComplexNum add(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum(a + c, b + d);}

    public ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum(a - c, b- d);
    }

    public ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum(a * c - b * d, b * c + a * d);
    }

    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }


    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(2, 2);
        ComplexNum num2 = new ComplexNum(4, 1);
        System.out.println(num1.add(num1, num2));
        System.out.println(num1.sub(num1, num2));
        System.out.println(num1.mul(num1, num2));
        System.out.println(num1.div(num1, num2));
    }
}