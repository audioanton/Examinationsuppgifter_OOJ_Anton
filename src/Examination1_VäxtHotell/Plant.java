package Examination1_VäxtHotell;

public abstract class Plant {
    private double height;
    private String name;

    public Plant(String name, double height) {
        this.name = name; //Jag behöver inga setters i detta program, därför väljer jag att undvika dem.
        this.height = height;
    }

    public String getName() { //Eftersom name och height är Private används getters för att komma åt deras värden, inkapsling.
        return name;
    }

    public double getHeight() {
        return height;
    }
}
