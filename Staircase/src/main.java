import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char [] arreglo = new char[n];
        Arrays.fill(arreglo,' ');

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                arreglo[n-i] = '#';

            }
            System.out.println(arreglo);
            
        }
    }
}
