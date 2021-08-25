package BusinessLogic;

public class calorieCounter {

    private static double caloriePerGramFat(double fat, double calorie) {

        return (fat * 9 * 100) / calorie;
    }

    public static boolean isHealthyItem(String itemName, double itemFat, double itemCalorie){

        double fatCalPercent = caloriePerGramFat(itemFat,itemCalorie);
        System.out.println("The percent of calories in " + itemName + " is: " + fatCalPercent + "%");
        if(fatCalPercent > 30 )
            return true;
        else
            return false;
    }

}
