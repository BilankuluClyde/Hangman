
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JButton[] btns = {new JButton("Full Screen"), new JButton("Half Screen"),
                new JButton("Minimize Screen"), new JButton("Custom size Screen")};
        btns[0].addActionListener
                (
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                wSize = ScreenSize.FullScreen;
                                frame.setSize(wSize.dim_Size());
                            }
                        }
                );
        btns[1].addActionListener
                (
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                wSize = ScreenSize.HalfScreen;
                                frame.setSize(wSize.dim_Size());
                            }
                        }
                );
        btns[2].addActionListener
                (
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                wSize = ScreenSize.Minimize;
                                frame.setSize(wSize.dim_Size());
                            }
                        }
                );
        btns[3].addActionListener
                (
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                wSize = ScreenSize.Custom;
                                frame.setSize(wSize.dim_Size());
                            }
                        }
                );

        JPanel btnPane = new JPanel();

        for (JButton btn : btns) {
            btnPane.add(btn, -1);
        }

        frame.getContentPane().add(btnPane, BorderLayout.SOUTH);
        frame.validate();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void run() {
        window.setVisible(true);
    }
}
