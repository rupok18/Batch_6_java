package myFirstPakcage;

public class Students {
   // The following variable are global variable
    // only declaired
    String name;
    int studentID;
    char gender;
    String group;


    public void study(){
        System.out.println("Students study to prepare the homework");
    }

    public void exam(){
       System.out.println("Students prepare for the exam every quarter of the year");
  }

  public static void main(String[] arg ) {
        Students obj = new Students();  // object of the "Students" class. // Instantiat the class
        // obj is refference variable

            obj.name = "Arafat";  // Initialize the variable
            obj.studentID = 101;
            obj.gender = 'M';
            obj.group = "Selenium";

        System.out.println(obj.name);  //  using the variable.
        System.out.println(obj.studentID);
        System.out.println(obj.gender);
        System.out.println(obj.group);

        obj.study();
        obj.exam();




  }


}
