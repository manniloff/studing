package problem_solving.staircase;

public class Stair {
    public void doStairs(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                if ((i + j) > value) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
