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
        if (name.strip() == ""){
            System.out.printf(error, "Name");
        }else{
            System.out.print("Enter your Age: ");
            age = scanner.nextInt();
            if (age<10 && 18 < age ){
                System.out.printf(error, "Age");
            }else{
                System.out.print("Enter subject 1: ");
                sub1 = scanner.nextLine();
                if(!sub1.startsWith("SE-") && sub1.strip() == ""){
                    System.out.printf(error,"Subject");
                }
            }
        }


    }
}