package patterns.bar.data;

import patterns.bar.employee.Barman;

public class Order implements Command {

    private final Barman barman;
    private final Product productToMake;

    public Order(Barman barista, Product productToMake) {
        this.barman = barista;
        this.productToMake = productToMake;
    }

    @Override
    public void execute() {
        if (this.productToMake instanceof Cocktail) {
            barman.mixCocktail((Cocktail) productToMake);
        } else {
            barman.makeDrink((Drink) productToMake);
        }
    }

    @Override
    public String toString() {
        return "Заказ{" + productToMake + '}';
    }
}
