import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");
        String name = scanner.nextLine();
        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.print("Podaj swój wzrost w centymetrach: ");
        double height = scanner.nextDouble()/100;
        System.out.print("Podaj swoją wage: ");
        double weight = scanner.nextDouble();

        Dimensions dimensions = new Dimensions(height,weight);

        User user = new User(name,age, dimensions);

       // double bmi = user.getDimensions().kilogramWeight/(user.getDimensions().centimeterHeight * user.getDimensions().centimeterHeight);

        System.out.println(user);
    }

}
