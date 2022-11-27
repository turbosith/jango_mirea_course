import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LabExample extends JFrame {
    static int milan = 0, real = 0;
    static String last = "N/A";
    static String vin = " ";
    static JLabel labe1 = new JLabel("     Result " + milan + " X " + real + "            ");
    static JLabel labe2 = new JLabel("                          Last Scorer: " + last + "                            ");
    static JLabel labe3 = new JLabel("                          Winner " + vin + "                            ");
    JButton button1 = new JButton("AC Milan");

    JButton button2 = new JButton("Real Madrid");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    LabExample() {
        super("Football");
        setLayout(new FlowLayout());
        setSize(300, 200);
        add(labe1, BorderLayout.SOUTH);
        add(labe2, BorderLayout.SOUTH);
        add(labe3, BorderLayout.SOUTH);
        add(button1, BorderLayout.SOUTH);
        add(button2, BorderLayout.SOUTH);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                milan++;
                labe1.setText("        Result " + milan + " X " + real + "         ");
                last = "AC Milan";
                labe2.setText("            Last Scorer: " + last + "              ");



                if (milan > real) {
                    labe3.setText("                          Winner " + "Milan" + "                            ");
                } else if (milan < real) {
                    labe3.setText("                          Winner " + "Real" + "                            ");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                real++;
                labe1.setText("        Result " + milan + " X " + real + "         ");
                last = "Real Madrid";
                labe2.setText("              Last Scorer: " + last + "          ");
                if (milan > real) {
                    labe3.setText("                          Winner " + "Milan" + "                            ");
                } else if (milan < real) {
                    labe3.setText("                          Winner " + "Real" + "                            ");
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabExample();
    }
}