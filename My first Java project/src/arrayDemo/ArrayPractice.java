package arrayDemo;

public class ArrayPractice {
             // what is characteristics of Array ... it is fixed in length
            // Array is static
    String []name = {"Bashir","Aksana","Tariq"};  // index order .. 0, 1, 2, 3
    public void arrayDemo1(){
       // System. out.println(" The name pf the instructor is " + name[0]);
        //System. out.println("The name pf the instructor is " +name[1]);
        //System. out.println( "The name pf the instructor is " +name[2]);
        //System. out.println( "The name pf the instructor is " +name[3]);


        int lengthofArray = name.length;
        System.out.println(lengthofArray);

       for (int i = 0; i< name.length; i++){
           System.out.println(name[i]);
       }

       // for each loop
        for(String studentsName:name){
            System.out.println(studentsName);
        }



        /* very common interview question
        What is the java exception you have encountered?
        i. Array index out of bound exception
        ii
         */




    }

    public static void main(String[]args) {

        ArrayPractice obj = new ArrayPractice();
        obj.arrayDemo1();
    }
}
