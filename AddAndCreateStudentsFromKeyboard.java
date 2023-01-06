import java.util.Scanner;

public class AddAndCreateStudentsFromKeyboard extends Student{

    Gender male = Gender.MALE;
    Gender female = Gender.FEMALE;

    public AddAndCreateStudentsFromKeyboard() {
        super();
    }

    public static Student createNewStudent() {
        System.out.println("Enter student name please:");
        Scanner scaner = new Scanner(System.in);
        String name = scaner.nextLine();

        System.out.println("Enter student lastName please:");
        Scanner scaner1 = new Scanner(System.in);
        String lastName = scaner.nextLine();

        System.out.println("Enter student GENDER please(You can enter male or female):");
        Scanner scaner2 = new Scanner(System.in);
        String gender1 = scaner.nextLine();
        Gender gender;
        if (gender1.equals("male")) {
            gender = Gender.MALE;
        } else {
            gender = Gender.FEMALE;
        }

        System.out.println("Enter student id:");
        Scanner scaner3 = new Scanner(System.in);
        int id = scaner3.nextInt();

        return new Student(name, lastName, gender, id);
    }
    
}
