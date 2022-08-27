import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            List<Long> arr = new ArrayList<>();
            int quantity;
            int sum =0;
            Scanner sc = new Scanner(System.in);

            System.out.println("Insert how long is the array: ");
            quantity = sc.nextInt();
            for (int i = 0; i < quantity; i++) {
                System.out.println("Insert elements to the array: ");
                arr.add(sc.nextLong());


            }
            for (int i = 0; i < quantity; i++) {
                sum+=arr.get(i);
            }
            System.out.println("The sum of the array is: "+sum);

        }
    }
