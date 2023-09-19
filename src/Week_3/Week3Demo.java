package Week_3;

import java.util.ArrayList;
import java.util.List;

public class Week3Demo {

        public static void main(String[] args) {
            // Primitive Data Type Reference
            int primitiveValue1 = 10;
            int primitiveValue2 = primitiveValue1; // Copy the value
            primitiveValue2 = 20; // Change the copied value

            System.out.println("Primitive Data Type Reference:");
            System.out.println("primitiveValue1: " + primitiveValue1); // Should print 10
            System.out.println("primitiveValue2: " + primitiveValue2); // Should print 20

            // Object Reference
            Person person1 = new Person("Alice");
            Person person2 = person1; // Copy the reference

            person2.setName("Bob"); // Modify the object through one reference

            System.out.println("\nObject Reference:");
            System.out.println("person1's name: " + person1.getName()); // Should print "Bob"
            System.out.println("person2's name: " + person2.getName()); // Should print "Bob"

            // String Reference  *SPECIAL*
            System.out.println("\nString Reference:");
            String str1 = "Hello";
            String str2 = str1; // Copy the reference

            str2 = str2 + " World"; // Create a new String and update str2 reference

            System.out.println("str1: " + str1); // Should print "Hello"
            System.out.println("str2: " + str2); // Should print "Hello World"



            List<Integer> integerList = new ArrayList<>();
            integerList.add(5);
            int myInt = 4;
            integerList.add(myInt); //auto boxing
            System.out.println("integerList = " + integerList);
//            List<int> intList = new ArrayList<>(); // error
            List<Double> doubleList = new ArrayList<>(); //
            doubleList.add(3.0);
            Double value = 15.75;
            doubleList.add(value);
            System.out.println("doubleList = " + doubleList);
//            List<double> doubleList = new ArrayList<>(); // error


        }
    }

    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


