import java.util.Scanner;

public class AddAndCreateStudentsFromKeyboard extends Student{

    public AddAndCreateStudentsFromKeyboard() {
        super();
    }

    public static Student createNewStudent() {
        System.out.println("Enter student name please:");
        try (Scanner scaner = new Scanner(System.in)) {
            String name = scaner.nextLine();

            System.out.println("Enter student lastName please:");
            try (Scanner scaner1 = new Scanner(System.in)) {
                String lastName = scaner1.nextLine();

                System.out.println("Enter student GENDER please(You can enter male or female):");
                try (Scanner scaner2 = new Scanner(System.in)) {
                    String gender1 = scaner2.nextLine();
                    Gender gender;
                    if (gender1.equals("male")) {
                        gender = Gender.MALE;
                    } else {
                        gender = Gender.FEMALE;
                    }

                    System.out.println("Enter student id:");
                    try (Scanner scaner3 = new Scanner(System.in)) {
                        int id = scaner3.nextInt();

                        return new Student(name, lastName, gender, id);
                    }
                }
            }
        }
    }

    public static void addStudentToGroup (Student student, Group group) {
        try {
            group.addStudent(student);
        } catch (GroupOverflowException e) {
            System.out.println("Your group is crowded");
        }
    }
}
