import java.util.Scanner;

public class Ochroniarz {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("What's your surname?");
        String surname=scanner.nextLine();
        System.out.println("Where do you live?");
        String city=scanner.nextLine();
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        System.out.println("Are you in a relationship? Please enter, true if yes and false if no");
        boolean relationship=scanner.nextBoolean();

        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(city.toUpperCase());
        System.out.println(age);
        if (relationship){
            System.out.println("In relationship");
        }
        else{
            System.out.println("Single");
        }
        System.out.println("Please check if the above information is correct. Please enter true if yes and false if no ");
        boolean information= scanner.nextBoolean();
        if (information) {
            System.out.println("Hello " + name + " " + surname + ", welcome in Tester club <3 ");
        }
        else{
            System.out.println("Please amend your details");

        }


        }


    }
