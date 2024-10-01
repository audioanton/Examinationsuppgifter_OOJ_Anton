package Examination1_VäxtHotell;

import static java.lang.String.format;

public class Cactus extends Plant implements I_nutrition {
    private final String nutritionType = "mineralvatten";

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public String calculateNutrition() {
        int dailyAmount = 2;
        return format("%s behöver %d cl %s om dagen.", this.getName(), dailyAmount, this.nutritionType);
    }

    public String getNutritionType() {
        return nutritionType;
    }
}
