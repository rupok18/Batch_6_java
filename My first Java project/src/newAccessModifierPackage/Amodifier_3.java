package newAccessModifierPackage;

import accessModifier.Amodifier_1;
import accessModifier.Amodifier_2;

public class Amodifier_3  extends Amodifier_1 {


    public static void main(String[] args){
        Amodifier_3 obj = Amodifier_3();

        System.out.println(obj.minute);
        //System.out.println(obj.hour);
        System.out.println(obj.day);

        obj.printminute();
        obj.printday();


    }

}
