package Task_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin element saiyini girin: ");
        n = scanner.nextInt();

        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        //Cemi arraya esasen daxil edin...
        System.out.print("Her hansi bir eded girin: ");
        k = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.printf("Toplami %d olan cutluklerin sayi: %d",k,count);
    }
}
