package oopConcept.PolymorphismDemo;

public class OverLoadDemo {


    /* Polymorphism is another OOP Principle. Poly means Many ... morphism means  face.
    that means many faces.

    That means we can have many faces of method.
    There are two Kinds of Polymorphism
    i. Method Overloading
    ii. Method Overriding

    Let's say you are working on three Applications. Each application has different url and
    different login information.
    Method overloading can be achieved keeping the same method name with different number of parameter,
    different data types and different order of parameter.

     */

    /**
     *
     * @param username
     * @param password
     *  This method is created for macys.com
     */

    public void login(String username, int password){
        // www.macy's.com
        //macyslogin
        System.out.println(" Macys front end credential");
    }

    /**
     * this method is created for www.macyscard.com
     * @param username
     * @param pin
     * @param password

    */
    public void Login( String username, int pin, int password ){
       // www.macyscard.com
        // macyscardlogin
        System.out.println(" Macys card credential");
    }

    /**
     * This method is created for macy's backend
     * @param number
     * @param hostUsername
     */
    public void login( int number, String  hostUsername ){
        // Macysdatabaselogin
       //www.mysql.com

        System.out.println(" Macy's back end credential");


    }
    public static void main( String[] args){
        OverLoadDemo obj = new OverLoadDemo();
        obj.login(43454, "Bashir");
        obj.login("Basiruddin", 456);
        obj.Login("Bashirtipu", 123, 45456);

    }
}
