package Task_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin element sayini daxil edin: ");
        int element = scanner.nextInt();
        int[] arr = new int[element];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Silmek istediyiniz index i girin: ");
        index = scanner.nextInt();
        int[] anotherArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i <arr.length; i++) {
            if (i==index){
                continue;
            }

            anotherArr[j++] = arr[i];
        }
        System.out.println(Arrays.toString(anotherArr));
    }
}
