package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeMachineStock coffeeMachineStock = createCoffeeMachine();

        startMenu(coffeeMachineStock,scanner);

    }

    private static void startMenu(
            CoffeeMachineStock coffeeMachineStock, Scanner scanner) {

        String menuOption = "start";

        while (!menuOption.equals("exit")) {

        System.out.println(printCoffeeMachineMainMenu());
        menuOption = scanner.nextLine();

            switch (menuOption) {
                case "start":
                    break;
                case "buy":
                    startBuyOption(coffeeMachineStock);
                    break;
                case "fill":
                    startFillOption(coffeeMachineStock);
                    break;
                case "take":
                    startTakeOption(coffeeMachineStock);
                    break;
                case "remaining":
                    System.out.println(printRemainingCoffeeMachineStock(coffeeMachineStock));
                    break;
                case "exit":
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + menuOption);
            }
        }
    }

    private static String printRemainingCoffeeMachineStock(CoffeeMachineStock coffeeMachineStock) {
        return coffeeMachineStock.toString();
    }

    private static void startBuyOption(CoffeeMachineStock coffeeMachineStock) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachineBuy coffeeMachineBuy = new CoffeeMachineBuy();

            System.out.println(printCoffeeMachineBuyMenu());
            String buyOption = scanner.nextLine();

            switch (buyOption) {
                case "1":
                    coffeeMachineBuy.makeEspresso(coffeeMachineStock);
                    break;
                case "2":
                    coffeeMachineBuy.makeLatte(coffeeMachineStock);
                    break;
                case "3":
                    coffeeMachineBuy.makeCappuccino(coffeeMachineStock);
                    break;
                case "back":
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + buyOption);
            }
    }

    private static void startFillOption(CoffeeMachineStock coffeeMachineStock) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachineFill coffeeMachineFill = new CoffeeMachineFill();

        coffeeMachineFill.fillCoffeeMachine(coffeeMachineStock, scanner);

    }
    private static void startTakeOption(CoffeeMachineStock coffeeMachineStock) {

        CoffeeMachineTake coffeeMachineTake = new CoffeeMachineTake();

        coffeeMachineTake.takeMoney(coffeeMachineStock);
    }


    private static CoffeeMachineStock createCoffeeMachine() {
        return new CoffeeMachineStock(
                400, 540, 120, 550, 9);

    }

    private static String printCoffeeMachineMainMenu() {
        return "Write action (buy, fill, take, remaining, exit)";
    }

    private static String printCoffeeMachineBuyMenu() {
        return "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:";
    }

}


