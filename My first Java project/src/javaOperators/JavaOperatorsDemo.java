package javaOperators;

public class JavaOperatorsDemo {
      // Arithmatic
     // Relational
    // Logical
    // Assignment

    public static void arithmaticOperators() {
        int a = 20;
        int b = 9;
        int result = 0;

        result = a + b;
        System.out.println(result);

        result = a - b;
        System.out.println(result);

        result = a * b;
        System.out.println(result);

        float fraction = (float) a / b; //type casting
        System.out.println(fraction);
        // byte Stores whole numbers from -128 to 127
        // byte Stores whole numbers from -32768 to 32767

        byte wheels = 4;
        short x = wheels;
        System.out.println(x);

        short RegNo = 32767;
        byte y = (byte) 33345;
        System.out.println(y);
    }

        public static void relationalOperators(){

            // Relational operators are>, < , >=, <= != will return boolean value
            int a = 20;
            int b = 9;
            boolean result = false;

            result = a > b;
            System.out.println(result);

            result = a < b;
            System.out.println(result);

            result = a >= b;
            System.out.println(result);

            result = a != b;  // not equal.
            System.out.println(result);
        }

        public static void logicalOperators () {

            // logical Operators are && (and) || (or) and also Return boolean value
            int a = 20;
            int b = 9;
            int c = 5;


            boolean result1 = (a > b) && (b < c);
            System.out.println(result1);

            boolean result2 = (a < b) || (a < c);
            System.out.println(result2);

            boolean result3 = (a > b) || (b < a) && (a < c);
            System.out.println(result3);


        }
        public static void main (String[]args){
            // JavaOperatorsDemo obj = new JavaOperatorsDemo();
            // obj.arithmaticOperqtors();
            // arithmaticOperators();
            relationalOperators();
            logicalOperators();


        }


    }
