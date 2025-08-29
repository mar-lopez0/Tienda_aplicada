package paneles;

import java.awt.*;
import javax.swing.*;

public class menuLateralPanel extends JPanel {

    public menuLateralPanel() {
        setPreferredSize(new Dimension(200, 0));
        setBackground(Color.GRAY);
        setLayout(new BorderLayout());

        JPanel buscarPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        buscarPanel.setBackground(Color.GRAY);
        buscarPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelBuscar = new JLabel("Buscar");
        JTextField campoBuscar = new JTextField();
        JButton entradaBoton = new JButton("Buscar");
        entradaBoton.setPreferredSize(new Dimension(30,30));

        buscarPanel.add(labelBuscar);
        buscarPanel.add(campoBuscar);
        buscarPanel.add(entradaBoton);

        add(buscarPanel, BorderLayout.NORTH);
    }

    public JPanel getPanel() {
        return this;
    }
}