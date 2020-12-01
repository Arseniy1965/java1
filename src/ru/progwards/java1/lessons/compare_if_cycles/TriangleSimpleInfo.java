package ru.progwards.java1.lessons.compare_if_cycles;

class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c) {

        int maxside;

        if ((a >= b) && (a >= c))
            maxside = a;

         else if ((b >= a) && (b >= c))
            maxside = b;

          else
            maxside = c;

        System.out.println (maxside);

        return maxside;

    }

    public static int minSide(int a, int b, int c){

       int minside;

        if ((a <= b) && (a <= c))
            minside=a;

         else if ((b <= a) && (b <= c))
            minside=b;

          else
            minside=c;

        System.out.println (minside);

        return minside ;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c){

        boolean iseq = (a == b) && (b == c) && (a == c);

        if (iseq)
        System.out.println(iseq);

        else
        System.out.println(iseq);

        return iseq ;

    }


    public static void main(String[] args) {
        maxSide(8,2,6);
        minSide(7,3,6);
        isEquilateralTriangle(5,5,5);
    }
}

class TriangleInfo{

    public static boolean isTriangle(int a, int b, int c){
        boolean result1 = (a < (b + c)) && (b < (a + c)) && (c < (a + b));
        if (result1)
            System.out.println(result1);
        else
            System.out.println(result1);

        return result1;
    }


    public static boolean isRightTriangle(int a, int b, int c) {

        boolean result2 = (a * a) + (b * b) == (c * c) || (b * b) + (c * c)== (a * a) || (c * c) + (a * a) == (b * b);
        if (result2)
            System.out.println(result2);
        else
            System.out.println(result2);

        return result2;


    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){

        boolean result3 = (a == b) || (a == c) || (b == c);

        if (result3)
            System.out.println(result3);
        else
            System.out.println(result3);

        return result3;

    }

    public static void main(String[] args) {
        isTriangle(10,2,2);
        isRightTriangle(30, 4, 5);
        isIsoscelesTriangle(30, 1, 3);
    }
}


class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) {

        boolean result = (number % 10) == digit;


            while (number>0) {
                if ((number % 10) == digit) {

                    return true;
                } else {
                    number = number / 10;
                                    }
            }
        return result;
    }









   public static int fiboNumber(int n){



        if (n<=2){

            return 1;
        }

        else {

            return fiboNumber(n-1)+fiboNumber(n-2);
        }
   }







    public static boolean isGoldenTriangle(int a, int b, int c){
        double a1 = a;
        double b1 = b;
        double c1 = c;

        if(a==b){
            double result = a1 / c1;
            if(1.61703 <= result && result <= 1.61903){
               return true;
            }
        }

        if(a==c){
            double result = a1 / b1;
            if(1.61703<=result && result<=1.61903){
                return true;
            }
        }

        if(b==c){
            double result = b1 / a1;
            if(1.61703<=result && result<=1.61903){
                return true;
            }
        }

        return false;
    }





        public static void main (String[]args) {

            System.out.println(containsDigit(4544, 5));


            int n = 0;
            while (n < 15) {
                n++;
                System.out.println(fiboNumber(n));
            }


            System.out.println(isGoldenTriangle(1618, 1618, 1000));


            for (n=1;fiboNumber(n) < 100;n++) {

                if(isGoldenTriangle(fiboNumber(n),fiboNumber(n),fiboNumber(n-1))){
                    System.out.println(fiboNumber(n));
                    //System.out.println("1");
                }
            }


        }

}