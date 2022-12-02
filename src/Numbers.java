import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        System.out.println("Welcome to Number ArrayList:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number from 0-40");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your next number from 0-40:");
        int number2 = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 40; i++) {
            numbers.add(i);

        }


        ArrayList<Integer> sub_number =new ArrayList<>(numbers.subList(number1, number2));
        System.out.println(sub_number);

    }
}









