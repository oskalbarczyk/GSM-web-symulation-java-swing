/**
 * GUI SET 03 "Sieć GSM"
 *
 * @author Oskar Kalbarczyk s27773 37c
 *
 * @version 0.0
 */

import Graphics.Visualisations.LayerVisual;
import Graphics.Visualisations.VDBvisual;
import Graphics.Visualisations.VRDvisual;
import Graphics.Window;
import javax.swing.*;
import java.util.ArrayList;
//Zakaz używania Timer oraz Executor!!!
//Do użycia: Wyjątki,kolekcje,wątki,wejścia/wyjście itp...
//Tylko standardowa biblioteka Javy!!!



public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new Main()
        );
    }

    public Main() {
        Window window = new Window();
    }
}