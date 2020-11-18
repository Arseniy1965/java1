package ru.progwards.java1.lessons.basics;

class reverseDigits {

  public static int reverseDigits(int number){

           int i1 = (number - (number%100))/100; // 100 --> 1
           int i2 = number%100 - number%10; // 10 --> 10
           int i3 = (number%10)*100;// 1 --> 100
           int reversedigits = i1 + i2 + i3;
           System.out.println(reversedigits);
           return reversedigits;
  }

    public static void main(String[] args) {

        reverseDigits(123);
    }
}

class Astronomy {

    public static Double sphereSquare(Double r){
        final double PI = 3.14;
        double square = 4 * PI * r * r;
        /*System.out.println(square);*/
        return square;
    }

   public static Double earthSquare(){
        final double earth = 6371.2;
        sphereSquare (earth);
        return sphereSquare(earth);
    }

    public static Double mercurySquare(){
        final double merc = 2439.7;
        sphereSquare (merc);
        return sphereSquare(merc);
    }

    public static Double jupiterSquare(){
        final double jup = 71492.0;
        sphereSquare (jup);
        return sphereSquare(jup);
    }

    public static Double earthVsMercury(){
        double evsm = earthSquare() / mercurySquare();
        return evsm;
    }

    public static Double earthVsJupiter(){
        double evsj = earthSquare()/ jupiterSquare();
        return evsj;
    }

    public static void main(String[] args) {

        earthSquare();
        System.out.println(earthSquare());
        mercurySquare();
        System.out.println(mercurySquare());
        jupiterSquare();
        System.out.println(jupiterSquare());
        earthVsMercury();
        System.out.println(earthVsMercury());
        earthVsJupiter();
        System.out.println(earthVsJupiter());
    }
}

class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius) {
        final double PI = 3.14D;
        double volumdoub =(4 * PI * radius * radius * radius)/3;
        return volumdoub;
    }

    public static float volumeBallFloat(float radius){
        final float PI = 3.14F;
        float volumfl =(4 * PI * radius * radius * radius)/3;
        return volumfl;
    }
    public static double calculateAccuracy(double radius) {
        double d=radius;
        float f=(float)d;
        double m =volumeBallDouble(radius) - volumeBallFloat(f) ;
        return m;
    }


    public static void main(String[] args){
            volumeBallDouble(1);
            System.out.println(volumeBallDouble(1));
            volumeBallFloat(1);
            System.out.println(volumeBallFloat(1));
            calculateAccuracy(6371.2);
        System.out.println(calculateAccuracy(6371.2));
        }

}