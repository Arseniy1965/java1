package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;


public class Eratosthenes {

    private boolean[] sieve;

    public Eratosthenes(int N) {
            sieve = new boolean[N + 1];
            Arrays.fill(sieve, true);
            sieve[0] = false;
            sieve[1] = false;
            sift();
    }


    private void sift() {

        for (int i = 2; i < sieve.length; i++)
            if (sieve[i]) {
            int j = i * 2;
            while ( j  < sieve.length) {
                sieve[j] = false;
                j += i;
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes a = new Eratosthenes(13);
        System.out.println(Arrays.toString(a.sieve));
        System.out.println(a.isSimple(13));
    }

}





class ArraySort {

 public static void sort(int[] a){

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int n = a[i];
                    a[i] = a[j];
                    a[j] = n;
                }
            }
        }
    }

    public static void main(String[] args) {

        int a[] ={-456,748,24,37,-87,-9,45,2,765,648};

        sort(a);

        for (int i = 0;  i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }
}

class DIntArray {

    private int[] ArrayInt = {};


    public void add(int num) {

        int[] ArrayInt1 = new int[ArrayInt.length + 1];// создаем массив +1
        System.arraycopy(ArrayInt, 0, ArrayInt1, 0, ArrayInt.length);//копируем со старого массива
        ArrayInt1[ArrayInt.length] = num;//добавляем значение в конце массива
        ArrayInt = ArrayInt1;
    }

    public void atInsert(int pos, int num) {

        int[] ArrayInt1 = new int[ArrayInt.length + 1]; //создаем массив +1
        System.arraycopy(ArrayInt, 0, ArrayInt1, 0, pos);//копирование до pos
        System.arraycopy(ArrayInt, pos, ArrayInt1, pos + 1, ArrayInt.length - pos);//продолжение копирования создание pos пустой
        ArrayInt1[pos] = num;//добавление значения в pos
        ArrayInt = ArrayInt1;
    }

    public void atDelete(int pos) {
        int[] ArrayInt1 = new int[ArrayInt.length - 1];//создаем массив на -1
        System.arraycopy(ArrayInt, 0, ArrayInt1, 0, pos);//копирование до pos
        System.arraycopy(ArrayInt, pos + 1, ArrayInt1, pos, ArrayInt.length - pos - 1);//продолжение копирования с удалением pos
        ArrayInt = ArrayInt1;
    }

    public int at(int pos) {
        return ArrayInt[pos];
    }

    @Override
    public String toString() {
        return Arrays.toString(ArrayInt);
    }
    public void print() {
        System.out.println(this.toString());
    }


    public static void main(String[] args) {

        DIntArray a = new DIntArray();

    }

}
