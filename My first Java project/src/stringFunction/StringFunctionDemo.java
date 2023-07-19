package stringFunction;

public class StringFunctionDemo {


    public static void stringPractice() {
        String name = "upright";

        int lengthOfMyString = name.length();
        // System.out.println(lengthOfMyString);
    }


    public static void changeCase() {
        String name = "upright";
        String upper = name.toUpperCase();
        System.out.println(upper);

        String lower = name.toLowerCase();
        System.out.println(lower);


    }

    public static void splitString() {

        String schoolName = "upright_Tech Solutions"; // (upright, Tech Solutions)

        String[] array0fSchoolName = schoolName.split("_");
        System.out.println(array0fSchoolName.length);
        System.out.println(array0fSchoolName[0]);
        System.out.println(array0fSchoolName[1]);
    }

    public static void StringToInt(){
        String money = "50";   // if there is fifty, it will be number format exception.
        System.out.println(money + 100); // resul =  50100
        int money1= Integer.parseInt(money);
        System.out.println(money1+100); //  result = 150

    }

    public static void intToString(){
        int money = 200;
        System.out.println(money+100); // result 300.
        String newMoney = String.valueOf(money);
        System.out.println(newMoney+100); //  result 200100.
    }

    public static String subStringDemo(){
        String email = "uprighttechsolutions@gmail.com";
         String newText = email.substring(7,11); // tech. if you put 7 it will print whole after upright.

        //System.out.println(newText);
        return newText;
    }

    public  static void replaceDemo(){
        String email = "uprighttechsolutions_gmail.com";
        String newEmail = email.replace( "_", "@");
        System.out.println(newEmail);
    }

        public static void reverse(){
        String schoolName = "Upright";  // thgirpu

          //  System.out.println(schoolName.charAt(6));
           // System.out.println(schoolName.charAt(5));
           // System.out.println(schoolName.charAt(4));
            //System.out.println(schoolName.charAt(3));
           // System.out.println(schoolName.charAt(2));
           // System.out.println(schoolName.charAt(1));
           // System.out.println(schoolName.charAt(0));


           // for ( int i = 6; i>=0; i--){
                //System.out.println( schoolName.charAt(i));

                for (int i = schoolName.length()-1; i>=0; i--){
                    System.out.println(schoolName.charAt(i));

                }
            }


            public static void main(String[] args){
       // stringPractice();
       //changeCase();
        //splitString();
        //StringToInt();
        String printNewText = subStringDemo();
        //System.out.println(printNewText);
        //Validation

        if (printNewText.equalsIgnoreCase("tech")) {
            System.out.println(" we are good");
        }
            else  {
                System.out.println(" please check back the string");
            }
            //replaceDemo();
           reverse();

        }




    }




