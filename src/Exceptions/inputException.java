package Exceptions;

import GetInput.input;

public class inputException {
    static Double itemFat;
    static Double itemCalorie;
    static String itemName;

    public static String foodName() {
        itemName = input.getItemName();

        try {
            if (!itemName.matches("[a-zA-Z]+")) {
                System.out.println();
                throw new Exception("Please Enter a valid item name!");
            }
        } catch (Exception var1) {
            System.err.println(var1.getMessage());
            foodName();
        }
        return itemName;
    }

    public static double foodFat() {
        String tempFat = input.getItemFat();

        try {
            itemFat = Double.parseDouble(tempFat);
            if (itemFat * 9 < 0) {
                System.out.println();
                throw new Exception("Fat cannot be less than zero!!");
            }
        } catch (Exception var2) {
            System.err.println(var2.getMessage());
            foodFat();
        }
        return itemFat;
    }

    public static double foodCalorie() {
        String tempCal = input.getItemCalorie();

        try {
            itemCalorie = Double.parseDouble(tempCal);
            if (itemCalorie < 0.0D) {
                System.out.println();
                throw new Exception("Calorie cannot be less than zero!!");
            }
        } catch (Exception var2) {
            System.err.println(var2.getMessage());
            foodCalorie();
        }
        return itemCalorie;
    }
}
