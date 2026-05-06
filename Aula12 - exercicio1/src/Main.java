import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(rand.nextDouble()*100);
        }

        list.sort(Collections.reverseOrder());

        for (Double aDouble : list) {
            System.out.println(aDouble);
        }
    }
}