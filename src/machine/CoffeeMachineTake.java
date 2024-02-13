package machine;

public class CoffeeMachineTake {
    public void takeMoney(CoffeeMachineStock coffeeMachineStock) {

        System.out.println("I gave you $" +coffeeMachineStock.getMoneyOnMachine());
        coffeeMachineStock.setMoneyOnMachine(0);

    }
}
