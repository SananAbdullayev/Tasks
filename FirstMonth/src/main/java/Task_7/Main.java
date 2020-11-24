package Task_7;

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
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] anotherArr = new int[arr.length-count];
        for (int i = 0,k=0; i < arr.length; i++) {
            if (arr[i]!=0){
                anotherArr[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(anotherArr));

        for (int i = 0; i < count; i++) {
            anotherArr = Arrays.copyOf(anotherArr, anotherArr.length + 1);
            anotherArr[anotherArr.length - 1] = 0;
        }

        System.out.println(Arrays.toString(anotherArr));


    }
}
