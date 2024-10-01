package Examination1_VäxtHotell;

public enum ExistingPlants {
    plant1("Igge"),
    plant2("Laura"),
    plant3("Meatloaf"),
    plant4("Olof");

    private final String name;

    ExistingPlants(String name) {
            this.name = name;
    }

    public String getName() {
        return name;
    }

}
