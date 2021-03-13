package ru.progwards.java1.lessons.bigints;

/*Реализовать класс ArrayInteger - целого числа произвольной длины на массиве byte[] digits; Каждый элемент массива
digits[i] может хранить только цифру, то есть число от 0 до 9. Например, число 159 должно занять 3 ячейки массива
digits[0] = 9; digits[1] = 5; digits[2] = 1;


        Реализовать методы:

        3.1 ArrayInteger(int n) - инициализирует класс, с максимальной точностью n цифр (размер массива)

        3.2 void fromInt(BigInteger value) - установить свое значение, взяв его из value (уложить BigInteger во внутренний массив)

        3.3 BigInteger toInt() - привести свое значение к BigInteger (преобразовать из массива в BigInteger)

        3.4 boolean add(ArrayInteger num) - сложить 2 числа, не используя BigInteger, а  используя массив digits,
        результат поместить в экземпляр ArrayInteger, у которого был вызван метод. При переполнении вернуть false, при этом само число сбросить в 0*/


import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {

    byte[] digits;

    public ArrayInteger(int n) {

        digits = new byte[n];
    }

    void fromInt(BigInteger value) {

        String val = value.toString();

        StringBuilder reversValue = new StringBuilder(val).reverse();

        char[] charValue = String.valueOf(reversValue).toCharArray();

        for (int i = 0; i < charValue.length; i++) {


            digits[i] = (byte) (charValue[i] - 48);// 48 = '0'
        }
    }

    public BigInteger toInt() {
        StringBuilder strToIn = new StringBuilder("");

        for (int i = 0; i <= digits.length - 1; i++) {
            strToIn.append(digits[i]);
        }
        strToIn.reverse();
        return new BigInteger(String.valueOf(strToIn));
    }

    public boolean add(ArrayInteger num)  {
        int l1 = num.digits.length;
        int l2 = this.digits.length;
        int j = 0;

        if((num.digits[l1 - 1] + this.digits[l1 - 1]) > 9) {

            for (int k = 0; k < l1; k++){
                num.digits[k] = 0;
            }
            return false;
        }

        for (int i = 0; i < l1; i++) {

            int result = (num.digits[i]) + ((i >= l2) ? 0 : (this.digits[i]) + j);
                num.digits[i] = ((byte) (result % 10));
                j = result > 9 ? 1 : 0;


        }
        return true;
    }
}
class Test1{
            public static void main (String[]args){
                ArrayInteger arrayInteger = new ArrayInteger(10);
                arrayInteger.fromInt(new BigInteger("123456789"));
                ArrayInteger arrayInteger1 = new ArrayInteger(10);
                arrayInteger1.fromInt(new BigInteger("987654321"));

                System.out.println(Arrays.toString(arrayInteger.digits));
                System.out.println(Arrays.toString(arrayInteger1.digits));

                System.out.println();

                System.out.println(arrayInteger.toInt());
                System.out.println(arrayInteger1.toInt());

                System.out.println();

                System.out.println(arrayInteger.add(arrayInteger1));
                System.out.println(arrayInteger1.toInt());
                System.out.println(Arrays.toString(arrayInteger1.digits));
            }
}
