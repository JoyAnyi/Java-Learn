import java.util.*;
public class SchoolSystem{
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean running = true;
        while(running){
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1: addStudent();
                break;
                case 2: viewAllStudents();
                break;
                case 3: searchStudentsByID();
                break;
                case 4: editStudent();
                break;
                case 5: removeStudent();
                break;
                case 6: running = false;
                default : System.out.println("Invalid chioce. Try again.");
            }
        }
        System.out.println("End of session.");
        scanner.close();
    }
    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student By ID");
        System.out.println("4. Edit Student");
        System.out.println("5. Remove Student");
        System.out.println("6. Exit");
        System.out.println("Choose an option: ");
    }

    public static void addStudent(){
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter StudentID: ");
        int studentID = scanner.nextInt();
        System.out.println("Enter Grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        students.add(new Student (name, studentID, grade));
        System.out.println("Student added successfully");
    }

    public static void viewAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students in the system.");
            return;
        } 
        for(Student s : students){
            s.displayInfo();
        }
    }

    public static void searchStudentsByID(){
        System.out.println("Enter student ID to search: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        for (Student s : students){
            if(s.getStudentID() == studentID){
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + studentID + "not found.");
    }
   
    public static void editStudent(){
        System.out.println("Enter student ID to edit: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        for(Student s : students){
            if(s.getStudentID() == studentID){
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.println("Enter new grade: ");
                double newGrade = scanner.nextDouble();
                scanner.nextLine();
                s.setName(newName);
                s.setGrade(newGrade);
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }

    public static void removeStudent(){
        System.out.println("Enter studentID to remove: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        for(Student s : students){
            if(s.getStudentID() == studentID){
                students.remove(s);
                System.out.println("Student removed succesfully.");
                return;
            }
        }
        System.out.println("Student with ID " + studentID + "not found.");
    }
}
