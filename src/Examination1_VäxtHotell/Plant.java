package Examination1_VäxtHotell;

public abstract class Plant {
    private double height;
    private String name;

    public Plant(String name, double height) {
        setName(name);
        setHeight(height);
    }

    public String getName() { //Inkapsling
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)  //Inkapsling
            this.height = height;
        else
            throw new IllegalArgumentException("Plantans höjd måste vara högre än 0.");
    }

    public void setName(String name) {
        if (name.isBlank())  //inkapsling
            throw new IllegalArgumentException("Namnet får ej vara tomt.");
        else
            this.name = name;
    }
}
