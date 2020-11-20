package Calculator;

import java.util.Scanner;

public class Main {
    //Console Color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println(ANSI_BLUE+"Supper Pupper Calculator alfa"+ANSI_RESET);
        double a = 0;
        double b = 0;
        double netice = 0;
        String operator = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_CYAN+"a = "+ANSI_RESET);
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } else {
            System.out.println(ANSI_RED+"Zehmet olmasa reqem daxil edin"+ANSI_RESET);
        }
        System.out.print(ANSI_CYAN+"b = "+ANSI_RESET);
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        } else {
            System.out.println(ANSI_RED+"Zehmet olmasa reqem daxil edin"+ANSI_RESET);
        }
        System.out.println(ANSI_CYAN+"operator(+,-,*,/,%,$) = "+ANSI_RESET);
        operator = scanner.next();

        if (operator.equals("+")) {
            netice = a + b;
            System.out.printf(ANSI_GREEN+"%f %s %f = %f\n"+ANSI_RESET, a, operator, b, netice);
        } else if (operator.equals("-")) {
            netice = a - b;
            System.out.printf(ANSI_GREEN+"%f %s %f = %f\n"+ANSI_RESET, a, operator, b, netice);

        } else if (operator.equals("*")) {
            netice = a * b;
            System.out.printf(ANSI_GREEN+"%f %s %f = %f\n"+ANSI_RESET, a, operator, b, netice);

        } else if (operator.equals("/")) {
            if (b != 0) {
                netice = a / b;
                System.out.printf(ANSI_GREEN+"%f %s %f = %f\n"+ANSI_RESET, a, operator, b, netice);

            } else {
                System.out.println(ANSI_RED+"adam kisi olar, 0-a bolmek olmaz"+ANSI_RESET);
            }
        } else if (operator.equals("%")) {
            netice = a % b;
            System.out.printf(ANSI_GREEN+"%f %s %f = %f\n"+ANSI_RESET, a, operator, b, netice);
        } else if (operator.equals("$")) {
            netice=1;
            for (int i=0;i<b;i++){
                netice = netice * a;
            }
//            netice = Math.pow(a, b);
            System.out.printf(ANSI_GREEN+"%f %s %f = %f\n"+ANSI_RESET, a, operator, b, netice);
        } else {
            System.out.printf(ANSI_RED+"%s operatoru desteklenmir\n"+ANSI_RESET, operator);
        }
    }
}
