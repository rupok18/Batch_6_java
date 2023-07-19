package finalKeyWord;

public  final class FinalSuper {
    /*
    Final variable cannot be modified
    Final method cannot be Overridden
    Final class cannot be extended.
     */
  final   String name = "Bashir"; // variable


    public void UprightTechSolution(){
        String mode = "online";

    }

    public static void main( String[] args){
        FinalSuper obj = new FinalSuper();
       // obj.name= "Tipu";

        System.out.println(obj.name); /* print Tipu coz Updated here , no final Declaire on variable
        if there is no "Tipu" then Print Bashir.
        if Final Declaired in variable we cantnot  Update.
        */
    }





}
