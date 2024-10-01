package Examination1_VäxtHotell;

import static java.lang.String.format;

public class PalmTree extends Plant implements I_nutrition {
    private final String nutritionType = "kranvatten";

    public PalmTree(String name, double height) {
        super(name, height);
    }

    @Override
    public String calculateNutrition() { //polymorphism
        double result = this.getHeight() * 0.5;
        return format("%s behöver %.2f liter %s om dagen.", this.getName(), result, this.nutritionType);
    }

    public String getNutritionType() {
        return nutritionType;
    }
}
