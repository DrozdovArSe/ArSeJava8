package patterns;

import patterns.barr.Bar;
import patterns.bar.data.Cocktail;
import patterns.bar.data.CocktailType;
import patterns.bar.data.Drink;

public class Launch {

    private static final String CLIENT_NAME_1 = "Артём";
    private static final String CLIENT_NAME_2 = "Андрей";

    public static void main(String[] args) {
        
        Bar bar = Bar.getInstance();

        System.out.println("\n" + CLIENT_NAME_1 + " делает заказ...");

        Cocktail cocktail = new Cocktail.Builder(CLIENT_NAME_1)
                .basis("белый ром")
                .secondComponent("сок лайма")
                .cocktailType(CocktailType.алкогольный)
                .build();

        bar.newOrder(cocktail);

        System.out.println("\n" + CLIENT_NAME_2 + " делает заказ...");
        bar.newOrder(new Drink.Builder(CLIENT_NAME_2)
                .drinkType("латте")
                .temperature("горячий")
                .build());
    }
}
