package machine;

public class CoffeeMachineBuy {


    public CoffeeMachineStock makeEspresso(CoffeeMachineStock coffeeMachineStock) {

      return areResourcesEnoughToMakeCoffee(coffeeMachineStock, coffeeType.ESPRESSO);

    }

    public CoffeeMachineStock makeLatte(CoffeeMachineStock coffeeMachineStock) {

       return areResourcesEnoughToMakeCoffee(coffeeMachineStock, coffeeType.LATTE);

    }

    public CoffeeMachineStock makeCappuccino(CoffeeMachineStock coffeeMachineStock) {

        return areResourcesEnoughToMakeCoffee(coffeeMachineStock, coffeeType.CAPPUCCINO);

    }

    public CoffeeMachineStock areResourcesEnoughToMakeCoffee(CoffeeMachineStock coffeeMachineStock, coffeeType type) {

        switch (type) {
            case ESPRESSO: calculateEspresso(coffeeMachineStock);
                break;
            case LATTE: calculateLatte(coffeeMachineStock);
                break;
            case CAPPUCCINO: calculateCappuccino(coffeeMachineStock);
                break;
        }
        return coffeeMachineStock;
    }
    public CoffeeMachineStock calculateEspresso(CoffeeMachineStock coffeeMachineStock) {

        if(isMachineWaterStockGreaterThanCoffeeRecipeWater(coffeeMachineStock, coffeeType.ESPRESSO)) {

        } else { System.out.println("Sorry, not enough water!\n");return coffeeMachineStock;}

        if (isMachineCoffeeBeansStockGreaterThanCoffeeRecipeBeans(coffeeMachineStock, coffeeType.ESPRESSO)) {

        } else { System.out.println("Sorry, not enough coffee beans!\n");return coffeeMachineStock;}

        if (isMachineDisposableCupsStockValid(coffeeMachineStock)) {

        } else { System.out.println("Sorry, not enough cups!\n");return coffeeMachineStock;}

        printSuccessMessage();

        deduceWaterOnMachine(coffeeMachineStock, coffeeType.ESPRESSO);
        deduceCoffeeBeansOnMachine(coffeeMachineStock, coffeeType.ESPRESSO);
        cashMoneyOnCoffeeMachine(coffeeMachineStock, coffeeType.ESPRESSO);
        deduceDisposableCupsOnMachine(coffeeMachineStock);

        return coffeeMachineStock;
    }

    public CoffeeMachineStock calculateLatte(CoffeeMachineStock coffeeMachineStock) {

        if(isMachineWaterStockGreaterThanCoffeeRecipeWater(coffeeMachineStock, coffeeType.LATTE)) {

        } else { System.out.println("Sorry, not enough water!\n");return coffeeMachineStock;}

        if (isMachineCoffeeBeansStockGreaterThanCoffeeRecipeBeans(coffeeMachineStock, coffeeType.LATTE)) {
;
        } else { System.out.println("Sorry, not enough coffee beans!\n");return coffeeMachineStock;}

        if (isMachineMilkStockGreaterThanCoffeRecipeMilk(coffeeMachineStock, coffeeType.LATTE)) {

        } else { System.out.println("Sorry, not enough milk!\n");return coffeeMachineStock;}

        if (isMachineDisposableCupsStockValid(coffeeMachineStock)) {

        } else { System.out.println("Sorry, not enough cups!\n");return coffeeMachineStock;}

        printSuccessMessage();

        deduceWaterOnMachine(coffeeMachineStock, coffeeType.LATTE);
        deduceCoffeeBeansOnMachine(coffeeMachineStock, coffeeType.LATTE);
        deduceMilkOnMachine(coffeeMachineStock, coffeeType.LATTE);
        cashMoneyOnCoffeeMachine(coffeeMachineStock, coffeeType.LATTE);
        deduceDisposableCupsOnMachine(coffeeMachineStock);

        return coffeeMachineStock;
    }

    public CoffeeMachineStock calculateCappuccino(CoffeeMachineStock coffeeMachineStock) {

        if(isMachineWaterStockGreaterThanCoffeeRecipeWater(coffeeMachineStock, coffeeType.CAPPUCCINO)) {

        } else { System.out.println("Sorry, not enough water!\n");return coffeeMachineStock;}

        if (isMachineCoffeeBeansStockGreaterThanCoffeeRecipeBeans(coffeeMachineStock, coffeeType.CAPPUCCINO)) {

        } else { System.out.println("Sorry, not enough coffee beans!\n");return coffeeMachineStock;}

        if (isMachineMilkStockGreaterThanCoffeRecipeMilk(coffeeMachineStock, coffeeType.CAPPUCCINO)) {

        } else { System.out.println("Sorry, not enough milk!\n");return coffeeMachineStock;}

        if (isMachineDisposableCupsStockValid(coffeeMachineStock)) {

        } else { System.out.println("Sorry, not enough cups!\n");return coffeeMachineStock;}

        printSuccessMessage();
        deduceWaterOnMachine(coffeeMachineStock, coffeeType.CAPPUCCINO);
        deduceCoffeeBeansOnMachine(coffeeMachineStock, coffeeType.CAPPUCCINO);
        deduceMilkOnMachine(coffeeMachineStock, coffeeType.CAPPUCCINO);
        deduceDisposableCupsOnMachine(coffeeMachineStock);
        cashMoneyOnCoffeeMachine(coffeeMachineStock, coffeeType.CAPPUCCINO);

        return coffeeMachineStock;
    }

    private boolean isMachineWaterStockGreaterThanCoffeeRecipeWater(CoffeeMachineStock coffeeMachineStock,
                                                                    coffeeType type) {
        return coffeeMachineStock.getWater() >= type.waterMeasure;
    }

    private boolean isMachineMilkStockGreaterThanCoffeRecipeMilk(CoffeeMachineStock coffeeMachineStock,
                                                                 coffeeType type) {
        return coffeeMachineStock.getMilk() >= type.milkMeasure;
    }

    private boolean isMachineCoffeeBeansStockGreaterThanCoffeeRecipeBeans(CoffeeMachineStock coffeeMachineStock,
                                                                          coffeeType type) {
        return coffeeMachineStock.getCoffeeBeans() >= type.coffeebeansMeasure;
    }

    private boolean isMachineDisposableCupsStockValid(CoffeeMachineStock coffeeMachineStock) {
        return coffeeMachineStock.getDisposableCups() >= 1;
    }

    private void deduceWaterOnMachine(CoffeeMachineStock coffeeMachineStock,
                                      coffeeType type) {
        coffeeMachineStock.setWater(
                coffeeMachineStock.getWater() - type.waterMeasure);

    }

    private void deduceMilkOnMachine(CoffeeMachineStock coffeeMachineStock,
                                     coffeeType type) {
        coffeeMachineStock.setMilk(
                coffeeMachineStock.getMilk() - type.milkMeasure);

    }

    private void deduceCoffeeBeansOnMachine(CoffeeMachineStock coffeeMachineStock,
                                            coffeeType type) {
        coffeeMachineStock.setCoffeeBeans(
                coffeeMachineStock.getCoffeeBeans() - type.coffeebeansMeasure);

    }

    private void deduceDisposableCupsOnMachine(CoffeeMachineStock coffeeMachineStock) {
        coffeeMachineStock.setDisposableCups(
                coffeeMachineStock.getDisposableCups() - 1);
    }

    private void cashMoneyOnCoffeeMachine(CoffeeMachineStock coffeeMachineStock, coffeeType type) {
        coffeeMachineStock.setMoneyOnMachine(
                coffeeMachineStock.getMoneyOnMachine() + type.price);
    }

    private void printSuccessMessage() {
        System.out.println("I have enough resources, making you a coffee!\n");
    }
}
