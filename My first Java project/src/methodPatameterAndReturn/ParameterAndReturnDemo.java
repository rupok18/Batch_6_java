package methodPatameterAndReturn;

public class ParameterAndReturnDemo {

  /*  public void add(){
        int x = 3;
        int y = 4;

        System.out.println(x+y); */


    public void add(int x, int y){ //declared // parameterize

        int z = x+y;
        int a = z;
        System.out.println(a);

        System.out.println(z);

        //  System.out.println(x + y);  // use
        // System.out.println(x - y);
        // System.out.println(x * y);
        // System.out.println(x / y);
     }


    public int substract(int x, int y) { //declared // parameterize

        int z = x + y;
        int a = z;

        System.out.println("Hi");
         return a;
    }

    public String studentsName(String name){

     return name;

    }

    public boolean gender(){
        boolean isMale = true;

        return isMale;


    }

    public static void main(String[] args) {
        ParameterAndReturnDemo obj = new ParameterAndReturnDemo();
       // obj.add(); // called the  method
       // obj.add(5,  4);
       // obj.add(9,10);
       int newValue = obj.substract(  20,  5);

        System.out.println(newValue);

         String newName = obj.studentsName("Bashir");
         System.out.println(newName);

         boolean gender = obj.gender();

        System.out.println(gender);





    }








}
