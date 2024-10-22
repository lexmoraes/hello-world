/*
 * Created by JFormDesigner on Wed Aug 28 20:35:26 AMT 2024
 */

package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author etech
 */
public class SegundaJanela extends JFrame {
    public SegundaJanela() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel4 = new JPanel();
        panel3 = new JPanel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        buttonBar = new JPanel();
        label1 = new JLabel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/image/eu.jpeg")).getImage());
        setForeground(SystemColor.textHighlight);
        setBackground(UIManager.getColor("Button.darkShadow"));
        setTitle("Minha primeira janela");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setForeground(SystemColor.windowBorder);
            dialogPane.setBackground(new Color(0x666666));
            dialogPane.setBorder(null);
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridLayout(1, 2));

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout());

                    //======== panel2 ========
                    {
                        panel2.setLayout(new GridLayout(1, 2));

                        //======== panel4 ========
                        {
                            panel4.setLayout(new GridLayout());

                            //======== panel3 ========
                            {
                                panel3.setLayout(new GridLayout(2, 2));

                                //---- label2 ----
                                label2.setText("Explique o conceito heran\u00e7a de POO.");
                                label2.setFont(new Font("Inter", Font.PLAIN, 21));
                                label2.setHorizontalAlignment(SwingConstants.CENTER);
                                panel3.add(label2);

                                //======== scrollPane1 ========
                                {

                                    //---- textArea1 ----
                                    textArea1.setTabSize(11);
                                    textArea1.setText("Descreva aqui");
                                    scrollPane1.setViewportView(textArea1);
                                }
                                panel3.add(scrollPane1);
                            }
                            panel4.add(panel3);
                        }
                        panel2.add(panel4);
                    }
                    panel1.add(panel2);
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- label1 ----
                label1.setText("@copyright Alex");
                buttonBar.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel4;
    private JPanel panel3;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel buttonBar;
    private JLabel label1;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
