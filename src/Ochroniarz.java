import java.util.Scanner;

public class Ochroniarz {
    public static void main(String[] args) {
        System.out.println("Podaj imie");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String surname=scanner.nextLine();
        System.out.println("Podaj miejsce zamieszkania");
        String city=scanner.nextLine();
        System.out.println("Podaj wiek");
        int age=scanner.nextInt();
        System.out.println("Czy jestes w zwiazku? Wpisz true albo false");
        boolean zwiazek=scanner.nextBoolean();
        System.out.println("Witaj "+ name+" "+surname);

        System.out.println("Zamieszkaly w "+city);
        System.out.println("lat"+age);
        if (zwiazek==true){
            System.out.println("W zwiazku");
        }
        else{
            System.out.println("Singiel");
        }
        System.out.println("w klubie Testersi");

    }
}
