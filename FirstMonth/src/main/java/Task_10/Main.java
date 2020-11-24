package Task_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int k;
        String rotate = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin elementlerinin sayini daxil edin: ");
        n = scanner.nextInt();
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Saga yoxsa Sola teref hereket etdireceyinizi qeyd edin (*sag* ve ya *sol* yazin)");
        rotate = scanner.next();

        if (rotate.trim().equalsIgnoreCase("sag")) {
            System.out.print("Massivin elementlerini nece defe hereket etdireceyinizi qeyd edin: ");
            k = scanner.nextInt();
            for (int i = 0; i < k; i++) {
                int last;
                last = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
            System.out.println(Arrays.toString(arr));

        } else if (rotate.trim().equalsIgnoreCase("sol")) {
            System.out.print("Massivin elementlerini nece defe hereket etdireceyinizi qeyd edin: ");
            k = scanner.nextInt();
            for (int i = 0; i < k; i++) {
                int j,first;
                first = arr[0];
                for (j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[j] = first;
            }
            System.out.println(Arrays.toString(arr));

        }else {
            System.out.println("Bele bir teref movcud ola biler ama bizim programa uygun deyil )))");
        }


    }
}
