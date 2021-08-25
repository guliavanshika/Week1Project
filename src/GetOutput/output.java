package GetOutput;

import BusinessLogic.calorieCounter;
import Exceptions.inputException;

public class output {

    static Double itemFat;
    static Double itemCalorie;
    static String itemName;

    public static void showOutput(){
        itemName = inputException.foodName();
        itemFat = inputException.foodFat();
        itemCalorie = inputException.foodCalorie();
        boolean healthyItem = calorieCounter.isHealthyItem(itemName,itemFat,itemCalorie);
        if(healthyItem == true)
        {
            System.out.println("This item is Not Heart healthy!");
        }
        else
        {
            System.out.println("This item is Heart healthy!");
        }
    }
}
