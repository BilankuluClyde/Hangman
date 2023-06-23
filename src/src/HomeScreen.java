
import javax.swing.*;
import java.awt.*;

public class HomeScreen extends JFrame {

    // Instance variables
    private JFrame window;
    private ScreenSize wSize;


    // Constructors
    public HomeScreen() {
        window = new JFrame("Hangman");
        wSize = ScreenSize.FullScreen;
    }

    // Methods
    public void setUp() {
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.AddScreenButtons(window);
        window.setSize(wSize.dim_Size());

    }

    public void AddScreenButtons(JFrame frame) {
        // Let's add a button to adjust the screen sizes
        // Starting off with the full screen button

        // Now the half screen button

        // Now the custom size button

        // Finally the custom button
    }

    public void run() {
        window.setVisible(true);
    }
}
