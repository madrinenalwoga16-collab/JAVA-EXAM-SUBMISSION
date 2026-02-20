import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Module Code (BSF, BIT, BCS, BCE): ");
        String moduleCode = input.nextLine().toUpperCase();

        String moduleName;
        int tuition;

        switch (moduleCode) {
            case "BSF":
                moduleName = "BSc. Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                moduleName = "BSc. Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                moduleName = "BSc. Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                moduleName = "BSc. Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong Module Code details");
                input.close();
                return;
        }

        System.out.println("Course Name: " + moduleName);
        System.out.println("Tuition Fee: UGX " + tuition);

        input.close();
    }
}