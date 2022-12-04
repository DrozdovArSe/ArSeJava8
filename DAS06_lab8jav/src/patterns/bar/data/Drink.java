package patterns.bar.data;

public class Drink extends Product {

    public static class Builder {

        private final String forWhom;
        private String drinkType = "";
        private String temperature = "";

        public Builder(String clientName) {
            this.forWhom = clientName;
        }

        public Builder drinkType(String drinkType) {
            this.drinkType = drinkType;
            return this;
        }

        public Builder temperature(String temperature) {
            this.temperature = temperature;
            return this;
        }

        public Drink build() {
            return new Drink(forWhom, drinkType, temperature);
        }
    }

    private final String forWhom;
    private final String drinkType;
    private final String temperature;

    private Drink(String forWhom, String drinkType, String temperature) {
        this.forWhom = forWhom;
        this.drinkType = drinkType;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Напиток{" + "для - " + forWhom + ", тип - " + drinkType + ", температура - " + temperature + '}';
    }
}
