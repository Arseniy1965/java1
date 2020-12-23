package ru.progwards.java1.lessons.bitsworld;


class SumBits {


    public static int sumBits(byte value) {
        int sum = 0;
        for (int i = 1; i < 9; i++) {
            if ((value & 1) == 1) {
                sum++;
            }
            value >>= 1;
        }

        return sum;}
        public static void main (String[]args){
            System.out.println(sumBits((byte) 0b01111111));
        }
}

class CheckBit {

        public static int checkBit(byte value, int bitNumber) {

            value >>= bitNumber;
            int result = value & 1;
            return result;
        }


            public static void main (String[]args){

                System.out.println(checkBit((byte) 0b01110011, 2));
            }

}



class Binary {
    byte num;

    public Binary(byte num) {
        this.num = num;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < 8; i++) {
            if ((num & 1) == 1) {
                str = 1 + str;
            }
            else {
                str = 0 + str;
            }
            num >>= 1;
        }

        return str;
    }

    public static void main(String[] args) {
        Binary binary = new Binary((byte) -128);
        System.out.println(binary.toString());
    }
}




