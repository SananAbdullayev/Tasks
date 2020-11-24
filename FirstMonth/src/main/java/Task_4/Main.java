package Task_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) {
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_BLUE + "Massivin element sayini daxil edin: ");
        int element = scanner.nextInt();
        int[] arr = new int[element];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + Arrays.toString(arr) + ANSI_RESET);
        System.out.print(ANSI_PURPLE + "Silmek istediyiniz index i girin: ");
        index = scanner.nextInt();
        int[] anotherArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }

            anotherArr[j++] = arr[i];
        }
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + Arrays.toString(anotherArr) + ANSI_RESET);
    }
}
