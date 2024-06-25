// In java class loading is the process of loading class file into the JVM(Java virtual machine) at runtime. It is responsible for loading classes from various sources, such as file system, network and databases and making them available to the JVM for execution.

// The class loading process and execution of a Java program involve a series of steps that ensure the bytecode is correctly loaded, verified, linked, and executed by the JVM. Understanding these steps helps in diagnosing issues related to class loading, memory management, and performance optimizations.

package module_26;

public class Second {
 
        static {
            System.out.println("Static block executed.");
        }
    
        public static void main(String[] args) {
            System.out.println("Main method executed.");
        }
    }
    
    

