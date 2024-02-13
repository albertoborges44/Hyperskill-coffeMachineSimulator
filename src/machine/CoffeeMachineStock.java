package machine;

public class CoffeeMachineStock {

    private int water;

    private int milk;

    private int coffeeBeans;

    private int moneyOnMachine;

    private int disposableCups;

    public CoffeeMachineStock(int water, int milk, int coffeeBeans, int moneyOnMachine, int disposableCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.moneyOnMachine = moneyOnMachine;
        this.disposableCups = disposableCups;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMoneyOnMachine() {
        return moneyOnMachine;
    }

    public void setMoneyOnMachine(int moneyOnMachine) {
        this.moneyOnMachine = moneyOnMachine;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                this.water + " ml of water\n" +
                this.milk + " ml of milk\n" +
                this.coffeeBeans + " g of coffee beans\n" +
                this.disposableCups + " disposable cups\n$" +
                this.moneyOnMachine + " of money\n";
    }
}
