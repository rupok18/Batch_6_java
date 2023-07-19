package oopConcept.PolymorphismDemo;

public class OverRiddingSub extends OverRidingSuper{

    // Creating method about upright course with some change .
    @Override
    public void uprightCourse() {
        super.uprightCourse(); // if we super.uprightCourse it will print first parent claas then child claas.
       // String group = "selenium";
       // System.out.println(" This is our group");
       // int duration = 4;
        //int numberOfTopic = 6;
        String location = "USA";
        System.out.println(location);
    }

    public static void main( String[] args){
        OverRidingSuper obj = new OverRiddingSub();
        obj.uprightCourse();

    }
}