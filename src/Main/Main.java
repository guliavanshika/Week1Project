package Main;

import GetOutput.output;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat;

        while(true){
            output.showOutput();

            System.out.println("Do you wan to continue (y/n) :");
            repeat = scanner.nextLine();

            if (repeat.equalsIgnoreCase("n") || repeat.equalsIgnoreCase("no") )
                break;
        }
    }
}
