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

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num)
    {
        this.c = c;
        this.d = d;
         a = a + c;
         b = b + d;

      return new ComplexNum(a,b);
    }

    public ComplexNum sub(ComplexNum num)
    {
        a = a - c;
        b = b - d;
        return new ComplexNum(a,b);
    }

    public ComplexNum mul(ComplexNum num)
    {
        a = a * c - b * d;
        b = b * c + a * d;
        return new ComplexNum(a,b);

    }

    public ComplexNum div(ComplexNum num) {
        a = (a * c + b * d) / (c * c + d * d);
        b = (b * c - a * d) / (c * c + d * d);
        return new ComplexNum(a,b);

    }


    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 4;
        int d = 1;
        

        //ComplexNum num1 = new ComplexNum(2, 2);
        //ComplexNum num2 = new ComplexNum(4, 1);
     //   System.out.println (add(a, b));
        //System.out.println(new ComplexNum (a - c, b - d));
       // System.out.println(new ComplexNum(a * c - b * d, b * c + a * d));
       // System.out.println(new ComplexNum(((a * c) + (b * d)) / ((c * c) + (d * d)),
          //    ((b * c) - (a * d)) / ((c * c) + (d * d));
    }
}