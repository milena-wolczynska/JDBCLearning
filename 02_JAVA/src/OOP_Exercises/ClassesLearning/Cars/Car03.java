package OOP_Exercises.ClassesLearning.Cars;

import java.sql.Date;
import java.time.LocalDate;

public class Car03 {
    // extends Object
    // attributes / fields
    String type; // = null;
    String color; // = null;
    String id;
    Date productionDate;
    //    public int sizeWheel; // primitive type
    Integer sizeWheel; // object type
    public Car03() { // constructor
    }
    // String myType = "Toyota", String myColor = "Red",
    public Car03(String myType, String myColor,
               // String id = "CB 007", Integer mySizeWheel = 18
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = Date.valueOf(LocalDate.now());
        this.sizeWheel = mySizeWheel;
    }
    public Car03(String myType, String myColor,
               Date myDateProduction,
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = myDateProduction;
        this.sizeWheel = mySizeWheel;
    }
    @Override
    public String toString() {
        return "\n==== \n Car: " +  this.type + " \n id: " + this.id + "\n=== \n";
    }
}
