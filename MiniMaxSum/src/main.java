import java.util.*;

public class main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList(Arrays.asList( 7,69,2,221,8974));

        Collections.sort(arr);
        //The minimun sum is 299
        int minSum = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            minSum+= arr.get(i);
        }
        int maxSum = 0;
        //The maximun sum is 9271
        arr.remove(0);
        for (int i = 0; i < arr.size(); i++) {
            maxSum+=arr.get(i);

        }
        //print (299,9266)
        System.out.println(minSum + " " + maxSum);
    }
}
