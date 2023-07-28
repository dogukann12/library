/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarywtable;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Doğukann
 */
public class LibraryWTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           SwingUtilities.invokeLater(() -> {
           LibraryWTableJFrame frame = new LibraryWTableJFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);
       }
           );    }
    
}
