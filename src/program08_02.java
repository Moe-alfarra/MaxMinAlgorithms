import java.util.Random;
public class program08_02 {

    public static void main(String[] args) {
        Random myRan = new Random();
        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRan.nextInt(0, 100);
        }
        int min = myArr[0];
        int max = myArr[0];
        int sum = 0;
        for (int i : myArr) {
            sum += i;
        }
        for (int j : myArr) {
            System.out.print(j + " ");
        }
        for (int i : myArr) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : myArr) {
            if (i > max) {
                max = i;
            }
        }
        double average =  sum / (double) myArr.length;
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
