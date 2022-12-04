package patterns.bar.data;

public class Cocktail extends Product {

    public static class Builder {

        private final String forWhom;
        private CocktailType cocktailType;
        private String basis = "";
        private String secondComponent = "";

        public Builder(String clientName) {
            this.forWhom = clientName;
        }

        public Builder cocktailType(CocktailType cocktailType) {
            this.cocktailType = cocktailType;
            return this;
        }

        public Builder basis(String basis) {
            this.basis = basis;
            return this;
        }

        public Builder secondComponent(String secondComponent) {
            this.secondComponent = secondComponent;
            return this;
        }

        public Cocktail build() {
            return new Cocktail(forWhom, cocktailType, basis, secondComponent);
        }
    }

    private final String forWhom;
    private final CocktailType cocktailType;
    private final String basis;
    private final String secondComponent;

    private Cocktail(String forWhom, CocktailType cocktailType, String basis, String secondComponent) {
        this.forWhom = forWhom;
        this.cocktailType = cocktailType;
        this.basis = basis;
        this.secondComponent = secondComponent;
    }

    @Override
    public String toString() {
        return "Коктейль{" + "для = " + forWhom + ", тип коктейля - " + cocktailType + ", основа - " + basis + ", второй ингридиент - " + secondComponent + '}';
    }
}
