package Task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        int piroq = 0;
        double qutu_sud = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_BLUE+"Sagirdlerin sayini daxil edin: "+ANSI_RESET);
        int students = scanner.nextInt();
        int[] weight = new int[students];

        Random random = new Random();
        for (int i = 0; i <weight.length; i++) {
            weight[i] =20 + random.nextInt(26);
        }
        System.out.println(ANSI_PURPLE+Arrays.toString(weight)+ANSI_RESET);

        for (int j : weight) {
            if (j < 30) {
                count++;
            }
        }
        qutu_sud =(double) (200*count)/900;
        int ceil =(int) Math.ceil(qutu_sud);
        piroq = piroq + count;
        System.out.println(ANSI_GREEN+ceil+ANSI_RED+" qutu sud");
        System.out.println(ANSI_GREEN+piroq+ANSI_RED+" dene piroq"+ANSI_RESET);
    }
}
