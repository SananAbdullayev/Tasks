package Task_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) {
        int x=0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_BLUE+"Massivin element sayini daxil edin: "+ANSI_RESET);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        //Ededlerin axtarisini asanlasdirmaq uchun chapa verirem;
        System.out.println(ANSI_BLUE_BACKGROUND+ANSI_BLACK+Arrays.toString(numbers)+ANSI_RESET);

        System.out.print(ANSI_PURPLE+"Axtarmaq istediyiniz ededi girin: "+ANSI_RESET);
        x = scanner.nextInt();
        for (int number : numbers) {
            if (number == x) {
                count++;
            }
        }
        if (count==0){
            System.out.println(ANSI_RED+"Axtardiginiz eded tapilmadi"+ANSI_RESET);
        }else {
            System.out.println(ANSI_PURPLE+"Axtardiginiz ededden "+ANSI_YELLOW+count+ANSI_PURPLE+" dene tapildi"+ANSI_RESET);
        }
    }
}