import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        System.out.println("Welcome to Number ArrayList:");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 40; i++) {
            numbers.add(i);

        }
        ArrayList<Integer> sub_number =new ArrayList<>(numbers.subList(23, 37));
        System.out.println(sub_number);


    }
}









