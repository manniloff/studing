package problem_solving.invert;

import java.util.Arrays;

public class Invertion {
    public void invert(Float[] data) {
        float temp;
        int j = data.length -1;
        int m = data.length%2;
        Arrays.stream(data).forEach(System.out::println);
        for (int i = 0; i < data.length; i++) {
            temp = data[j];
            data[j] = data[i];
            data[i] = temp;
            j--;
        }
        Arrays.stream(data).forEach(System.out::println);
    }
}
