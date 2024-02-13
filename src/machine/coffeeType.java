package machine;

public enum coffeeType {

    ESPRESSO(250, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    final int waterMeasure;
    int milkMeasure;
    int coffeebeansMeasure;
    int price;

    coffeeType(int waterMeasure, int coffeebeansMeasure, int price) {
        this.waterMeasure = waterMeasure;
        this.coffeebeansMeasure = coffeebeansMeasure;
        this.price = price;
    }

    coffeeType(int waterMeasure, int milkMeasure, int coffeebeansMeasure, int price) {
        this.waterMeasure = waterMeasure;
        this.milkMeasure = milkMeasure;
        this.coffeebeansMeasure = coffeebeansMeasure;
        this.price = price;
    }


}
