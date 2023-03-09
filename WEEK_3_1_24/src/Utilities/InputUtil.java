package Utilities;

import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static String inputStr(String info) {
        System.out.print(info + " :");
        var data = scanner.next();
        return data;
    }

    public static int inputInt(String info) {
        System.out.print(info + " :");
        int data = scanner.nextInt();
        return data;
    }

    
}
