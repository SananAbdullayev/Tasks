package Task_5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) {
        int[] arr = new int[20];
        int max1 = arr[0];
        int max2 = arr[1];
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int j : arr) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2)
                max2 = j;
        }
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (number == max2) {
                index = i;
            }
        }
        System.out.println(ANSI_BLUE_BACKGROUND+ANSI_BLACK+Arrays.toString(arr)+ANSI_RESET);
        System.out.println(ANSI_GREEN+"En boyuk ikinci eded: " +ANSI_PURPLE+ max2);
        System.out.println(ANSI_GREEN+"En boyuk ikinci ededin indexi: " +ANSI_PURPLE+ index+ANSI_RESET);


    }
}
