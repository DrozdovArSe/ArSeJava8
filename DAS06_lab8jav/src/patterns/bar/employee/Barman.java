package patterns.bar.employee;

import patterns.bar.data.Cocktail;
import patterns.bar.data.Drink;

public class Barman {

    public void mixCocktail(Cocktail burger) {
        System.out.println("Бармен смешал " + burger);
    }

    public void makeDrink(Drink pizza) {
        System.out.println("Бармен приготовил " + pizza);
    }
}
