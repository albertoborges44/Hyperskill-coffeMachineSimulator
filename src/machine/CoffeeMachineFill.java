package machine;

import java.util.Scanner;

public class CoffeeMachineFill {

    public void fillCoffeeMachine(CoffeeMachineStock coffeeMachineStock, Scanner scanner) {

        System.out.println("Write how many ml of water you want to add");
        coffeeMachineStock.setWater(
                coffeeMachineStock.getWater() + scanner.nextInt());

        System.out.println("Write how many ml of milk you want to add:");
        coffeeMachineStock.setMilk(
                coffeeMachineStock.getMilk() + scanner.nextInt());

        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeMachineStock.setCoffeeBeans(
                coffeeMachineStock.getCoffeeBeans() + scanner.nextInt());

        System.out.println("Write how many disposable cups you want to add:");
        coffeeMachineStock.setDisposableCups(
                coffeeMachineStock.getDisposableCups() + scanner.nextInt());

    }

}
