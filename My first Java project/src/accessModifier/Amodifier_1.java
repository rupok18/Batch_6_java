package accessModifier;

public class Amodifier_1 {

    /* public variables and methods are accessible across the project.
    private variables and methods are accessible only its own class.
    to solve the issue we use encapsulation.
    No access/packagePrivate variables and methods are accessible only within its own package .
    To solve this issue we use protected Access Modifier.

     */

    public  int minute = 60;
     int hour = 24;
    protected String day = "Wednesday";  // no access or package private.
    public void printminute(){

        System.out.println("public Am");
    }

        public void printMinute(){
            System.out.println("Private  Am");
        }

            protected void printday(){
                System.out.println("PackagePrivate  Am");
    }

    public static void main(String[] args){
        Amodifier_1 obj = new Amodifier_1();
        System.out.println(obj.minute);
        System.out.println(obj.hour);
        System.out.println(obj.day);

        obj.printminute();
        obj.printday();

    }

}
