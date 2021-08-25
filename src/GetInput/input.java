package GetInput;

import java.util.Scanner;

public class input {
    static String itemName;
    static String itemFat;
    static String itemCalorie;

    static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }

    public static String getItemName() {
        System.out.println("Enter item name :");
        return scanner.nextLine();
    }

    public static void setItemName(String itemName) {
        input.itemName = itemName;
    }

    public static String getItemFat() {
        System.out.println("Enter fat-gram of the item :");
        return scanner.nextLine();
    }

    public static void setItemFat(String itemFat) {
        input.itemFat = itemFat;
    }

    public static String getItemCalorie() {
        System.out.println("Enter calorie of the item :");
        return scanner.nextLine();
    }

    public static void setItemCalorie(String itemCalorie) {
        input.itemCalorie = itemCalorie;
    }
}
