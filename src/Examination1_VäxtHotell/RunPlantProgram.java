package Examination1_VäxtHotell;
import javax.swing.*;
import static java.lang.String.format;

public class RunPlantProgram {
    public RunPlantProgram() {
        Cactus c = new Cactus(ExistingPlants.plant1.getName(), 0.2);
        PalmTree pt1 = new PalmTree(ExistingPlants.plant2.getName(), 5);
        CarnivorousPlant cp = new CarnivorousPlant(ExistingPlants.plant3.getName(), 0.7);
        PalmTree pt2 = new PalmTree(ExistingPlants.plant4.getName(), 1);

        while (true) {
            String exitMessage = "Programmet avslutas";
            String message = format("Välj en av följande växter: %s, %s, %s, %s.%n", c.getName(), pt1.getName(), cp.getName(), pt2.getName());

            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (input == null) {
                JOptionPane.showMessageDialog(null, exitMessage);
                break;
            }

            for (ExistingPlants plant : ExistingPlants.values()) {
                if (input.trim().equalsIgnoreCase(plant.getName())) {
                    message = switch (plant) {
                        case plant1 -> c.calculateNutrition();
                        case plant2 -> pt1.calculateNutrition();
                        case plant3 -> cp.calculateNutrition();
                        case plant4 -> pt2.calculateNutrition();
                    };
                }
            }
            JOptionPane.showMessageDialog(null, message);
            int i = JOptionPane.showConfirmDialog(null, "Vill du fortsätta?", "Fortsätt/Avsluta", JOptionPane.YES_NO_OPTION);
            if (i != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, exitMessage);
                break;
            }
        }
    }

    public static void main(String[] args) {
        RunPlantProgram rp = new RunPlantProgram();
    }
}
