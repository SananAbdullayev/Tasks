package Task_8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin element sayini daxil edin: ");
        n = scanner.nextInt();
        Random random = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int lastNum = arr[n - 1];
        int lastNumb = lastNum;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > lastNum) {
                lastNum = arr[i];
                System.out.println(arr[i] + " Liderdir!!!");
                count++;
            }
        }
        System.out.println(lastNumb + " son Liderdir!!!");
        System.out.println("Liderlerin sayi: "+(count+1));
    }
}
