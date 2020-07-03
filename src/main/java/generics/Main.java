package generics;

public class Main {
    public static void main(String[] args) {
        CompareData<Integer> compareData = new CompareData<>();

        System.out.println(compareData.compare(2,2));
        System.out.println(compareData.compare(1,2));

        CompareData<String> compareData1 = new CompareData<>();

        System.out.println(compareData1.compare("abc","abc"));
        System.out.println(compareData1.compare("abcd","avc"));
    }
}
