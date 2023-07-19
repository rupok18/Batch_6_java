package controlFlowStatements;

public class Loop {

    public static void loopIntro() {

        // Please print 1 to 10

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);
        // How many Kinds of loop there are ? i. while loop ii. For loop iii. Do- while loop
        /*How many parts of the loop?
         i. Initialization
         ii. cobdition
         iii. Execution
         iv. Increment/ Decrement

         */

    }



   /* public static void whileLoop(){
       int a =1;  // Initialization
       while (a<=10){   // condition
           System.out.println(" the value of a " +a); // statement
           a++; // Increment*/






        public static void whileLoop(int initialize, int limit) {
            int a = initialize;  // Initialization
            while (initialize <= limit) {   // condition
                System.out.println(" the value of a " + initialize); // statement
                initialize ++; // Increment
            }
        }

        public  static void whileloop2(){
            int a = 50;
            while (a>=50){
                System.out.println("the Value of a" + a);
                a = a-2; // decrement even number
               // a--; // decrement 50 to 1


            }
        }

       public static void forLoop(){
            for(int i = 1; i<=50; i++){
                System.out.println("the Value of a" + i);   // statement
            }
       }


       public static void doWhileLoop(){
            int y = 5;
            do {
                System.out.println(" the value of y" + y);
                y++;
            }

                while (y <= 10); //while condition at the end.


            }

            // can you implement Fibonacci sequence use using loop
             /*
             0, 1, 1. 2, 3, 5, 8,13, 21 we using this to pointing our stories
              */

    public static void febonacci(){
        int firstNumber = 0;
        int secondNumber =1;

        for(int i=1; i<=7; i++){
            int thirdNumber = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber= thirdNumber;


        }
          System.out.println(secondNumber);
    }




    public static void main(String[] args){
       // loopIntro();
       // whileLoop (initialize 1, limite 50);  // call the method, giving an argument/ giving a value
       // whileloop2();
        //forLoop();
        //doWhileLoop();
        febonacci();

    }
}
