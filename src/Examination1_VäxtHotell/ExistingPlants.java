package Examination1_VäxtHotell;

public enum ExistingPlants {
    plant1("Igge", 0.2),
    plant2("Laura", 5),
    plant3("Meatloaf", 0.7),
    plant4("Olof", 1);

    private final String name;
    private final double height;

    ExistingPlants(String name, double height) {
            this.name = name;
            this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

}
