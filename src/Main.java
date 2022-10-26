import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Kate";
        String surname = "Nesterovich";
        String profession = "Engineer";
        System.out.print(name + " ");
        System.out.print(surname + " ");
        System.out.println(profession);
        variables();
        scanner();
    }
    private static void variables() {
        byte b = 100;
        short s = 10000;
        int i = 1000000000;
        long l = 1000000000000L;
        float f = 1.0F;
        double d = 10.1;
        char c = 'C';
        boolean bool = true;
        String str = "I am a string";
        System.out.print(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + bool + " " + str);
        System.out.println();
    }
    private static void scanner() {
        String str;
        System.out.print("Введите любую строку:");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String str2 = " Second string";
        str = str + str2;
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str.toLowerCase()));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf('S'));
        System.out.println(str.lastIndexOf('S'));
        System.out.println(str.isEmpty());
    }
}