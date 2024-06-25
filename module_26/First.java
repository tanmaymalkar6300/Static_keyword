//Q. Why do we need static keyword in java Explain with an example?

//Ans:- Static keyword is mainly used in memory management in java.
// A static keyword can be applied to variables, blocks,methods and classes.  
// it makes our program more efficent, as every object doesn't 
// allocate separate memory to a static variable.
package module_26;

class Student
{
    int age = 5;    // instance variable, non - static variable
    static String school;  // non - instance variable, static variable

    static 
    {
        school = "PW";
    }


    public void show()
    {
        System.out.println("in show " + age + " " + school); // static variable can be accessed in non-static method
    }
    public static void study()
    {
        System.out.println("studying ");    // non-static variable cannot be accessed here
    }
}

public class First

{

    static{
        System.out.println("in static block");
    }

    public static void main(String[] args) {
       
        System.out.println("in main method");

        Student obj = new Student();

        Student.study();
        obj.age = 19;
        obj.school = "PWSkills";
        
        Student obj1 = new Student();
        System.out.println(obj1.school);
       
        obj.show(); // in show 19 PWSkills
        obj1.show();    // in show 0 ?

    }    
}
