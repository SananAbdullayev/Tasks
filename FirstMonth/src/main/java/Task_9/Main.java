package Task_9;

import com.sun.media.sound.RIFFReader;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int countCut = 0;
        int countTek = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin element sayini daxil edin: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                countCut++;
            }else {
                countTek++;
            }
        }
        System.out.println(countCut);
        System.out.println(countTek);
        int[] anotherArrCut = new int[arr.length-countTek];
        int[] anotherArrTek = new int[arr.length-countCut];
        for (int i = 0,k=0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                anotherArrTek[k++] = arr[i];
            }
        }
        for (int i = 0,k=0; i < arr.length; i++) {
            if (arr[i]%2==0){
                anotherArrCut[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(anotherArrTek));
        System.out.println(Arrays.toString(anotherArrCut));

        int[] result = new int[anotherArrCut.length + anotherArrTek.length];

        System.arraycopy(anotherArrCut, 0, result, 0, anotherArrCut.length);
        System.arraycopy(anotherArrTek, 0, result, anotherArrCut.length, anotherArrTek.length);

        System.out.println("Axirki yekun netice :)");
        System.out.println(Arrays.toString(result));

    }
}

