import java.util.Scanner;

class StudentRepo{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Error Message
        String error = "\033[1;31mInvalid %s\n\033[0m";

        //names
        String name;

        //Age
        int age;

        //Subjects
        String sub1,sub2,sub3;

        //marks
        int mrks1,mrks2,mrks3;

        //Name validation
        System.out.print("Enter name Student 1: ");
        name = scanner.nextLine();
        assert name.strip() != "" : "\033[1;31mInvalid Name\033[0m";

        //Age validation
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();
        assert age > 10 && 18 > age :"\033[1;31mInvalid Age\033[0m";
    
        //subject validation
        System.out.print("Enter subject 1: ");
        scanner.nextLine();
        sub1 = scanner.nextLine();
        assert sub1.startsWith("SE-") == true && sub1.strip() != "" : "\033[1;31mInvalid Subject\033[0m";
        
        System.out.print("Enter subject 2: ");
        scanner.nextLine();
        sub1 = scanner.nextLine();
        assert sub1.startsWith("SE-") == true && sub1.strip() != "" : "\033[1;31mInvalid Subject\033[0m"; 

        System.out.print("Enter subject 3: ");
        scanner.nextLine();
        sub1 = scanner.nextLine();
        assert sub1.startsWith("SE-") == true && sub1.strip() != "" : "\033[1;31mInvalid Subject\033[0m"; 

        //marks validation
        assert 

        



    }
}