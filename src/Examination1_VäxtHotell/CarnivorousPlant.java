package Examination1_VäxtHotell;

import static java.lang.String.format;

public class CarnivorousPlant extends Plant implements I_nutrition {
    private final String nutritionType = "proteindryck"; //Final för den behöver aldrig ändras.


    public CarnivorousPlant(String name, double height) {
        super(name, height); //Här används konstruktorn i superklassen Plant.
    }

    @Override
    public String calculateNutrition() {
        double result = 0.1 + (this.getHeight() * 0.2);
        return format("%s behöver %.2f liter %s om dagen.", this.getName(), result, nutritionType);
    }

    public String getNutritionType() {
        return nutritionType;
    }
}
