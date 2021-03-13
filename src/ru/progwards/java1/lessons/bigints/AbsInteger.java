package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class AbsInteger {

    static AbsInteger add(AbsInteger num1, AbsInteger num2){

        AbsInteger num;

        int i1 = Integer.parseInt(num1.toString());
        int i2 = Integer.parseInt(num2.toString());
        int result = i1 + i2;

        if (result >= -128 & result <= 127){
            return new ByteInteger((byte) (result));

        }
        if (result >= -32768 & result <= 32767) {
            return new ShortInteger((short) (result));

        } else {
            return new IntInteger(result);
        }
    }
}

class ByteInteger extends AbsInteger{

    byte value ;


    public ByteInteger(byte value){
        this.value = value;
    }

    public String toString(){
        return Byte.toString(value);
    }
}

class ShortInteger extends AbsInteger{
    short value;

    public ShortInteger(short value){
        this.value = value;
    }

    public String toString(){
        return Short.toString(value);
    }
}

class IntInteger extends AbsInteger{
    int value;

    public IntInteger(int value){
        this.value = value;
    }

    public String toString(){
        return Integer.toString(value);
    }
}

 class Test{

    public static void main(String[] args) {

        ByteInteger byteInt1 = new ByteInteger((byte) 1000);
        ByteInteger byteInt2 = new ByteInteger((byte) 29);
        ShortInteger shortInt1 = new ShortInteger((short) 50);
        ShortInteger shortInt2 = new ShortInteger((short) 50);
        IntInteger intInt1 = new IntInteger(129);
        IntInteger intInt2 = new IntInteger(142);

        System.out.println(AbsInteger.add(byteInt1, byteInt2));
        System.out.println(AbsInteger.add(byteInt1, shortInt2));
        System.out.println(AbsInteger.add(shortInt1, byteInt2));
        System.out.println(AbsInteger.add(shortInt1, shortInt2));
        System.out.println(AbsInteger.add(byteInt1, intInt2));
        System.out.println(AbsInteger.add(shortInt1, intInt2));
        System.out.println(AbsInteger.add(intInt1, intInt2));
        System.out.println(AbsInteger.add(intInt1,byteInt2));
        System.out.println(AbsInteger.add(intInt1, shortInt2));

    }
}