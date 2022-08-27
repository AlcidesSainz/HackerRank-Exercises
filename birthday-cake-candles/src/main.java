import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer>candles = new ArrayList<>(Arrays.asList(18,90,90,13,90,75,90,8,90,43));
        int maxNum=0;
        int count = 0;
        Collections.sort(candles);
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i)>maxNum){
                maxNum = candles.get(i);
            }
        }
        for (int i = 0; i < candles.size(); i++) {
            if (maxNum == candles.get(i)){
                count++;
            }

        }
        System.out.println(maxNum);
        System.out.println(count);
    }
}
