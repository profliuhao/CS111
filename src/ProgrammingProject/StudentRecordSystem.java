package ProgrammingProject;

import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize a fake list of 5 courses;
        Course[] courseList = new Course[5];
        // fill in here with 5 fake courses

        // initialize a student:
        Student activeStudent = null;
        System.out.print("Enter student's ID (-1 to create a new student): ");
        int studentIDInput = Integer.parseInt(scanner.nextLine());

        if (studentIDInput == -1) {
            // Create a new student
            System.out.print("Enter student's age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter student's gender: ");
            String gender = scanner.nextLine();

            // Get address information
            // (You can reuse the Address class and create an Address object)
            System.out.print("Enter student's address: ");
            Address address = new Address("", "", "", 10000);

            System.out.print("Enter student's name: ");
            String studentName = scanner.nextLine();

            // Create a new student
            activeStudent = new Student(age, gender, address, studentIDInput, studentName);
        }


        while (true) {
            System.out.println("Menu:");
            System.out.println("L – List all courses");
            System.out.println("E – Enroll a course");
            System.out.println("W – Withdraw a course");
            System.out.println("S – Search a course by name");
            System.out.println("M – List all My Classes");
            System.out.println("X – Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice.toUpperCase()) {
                case "L":
                    // Implement list functionality
                    break;
                case "E":
                    // Implement enroll functionality
                    break;
                case "W":
                    // Implement withdraw functionality
                    break;
                case "S":
                    // Implement search functionality
                    break;
                case "M":
                    // Implement my classes functionality
                    break;
                case "X":
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
