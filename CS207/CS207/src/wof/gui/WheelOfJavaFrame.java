/**
 * @author Nikita Kouevda, Jenny Shen
 * @date 2013/10/05
 */

package wof.gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import wof.game.WheelOfJavaGame;

@SuppressWarnings("serial")
public class WheelOfJavaFrame extends JFrame {
    public WheelOfJavaFrame() {
        super("Wheel of Java");

        WheelOfJavaGame game = new WheelOfJavaGame();

        WheelOfJavaTopPanel topPanel = new WheelOfJavaTopPanel(game);
        WheelOfJavaPuzzlePanel puzzlePanel =
            new WheelOfJavaPuzzlePanel(game);
        WheelOfJavaWheelPanel wheelPanel =
            new WheelOfJavaWheelPanel(game, topPanel, puzzlePanel);

        setLayout(new FlowLayout());
        add(topPanel);
        add(puzzlePanel);
        add(wheelPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            // Use system-specific UI if possible
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            // Proceed without system-specific UI
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WheelOfJavaFrame();
            }
        });
    }
}
