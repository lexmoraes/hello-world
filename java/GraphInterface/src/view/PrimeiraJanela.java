package view;

import javax.swing.*;
import java.awt.*;


public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela() {
        initComponents();
    }
    private void initComponents () {

        //=========== this ============
        setPreferredSize(new Dimension(250, 150));
        var contentPane = getContentPane();
        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
    }
}


