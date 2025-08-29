package paneles;

import java.awt.*;
import javax.swing.*;

public class productoPanel extends JPanel {

    public productoPanel() {
        // Usamos BoxLayout en vertical (eje Y)
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);

        // Título
        JLabel titulo = new JLabel("Producto");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setForeground(Color.BLACK);
        titulo.setAlignmentX(Component.LEFT_ALIGNMENT); // alineado a la izquierda
        add(titulo);

        JPanel grid = new JPanel(new GridLayout(2, 4, 10, 10)); // 2 filas, 4 columnas
        grid.setBackground(Color.WHITE);
        grid.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        for (int i = 1; i <= 8; i++) {
            JPanel producto = new JPanel();
            producto.setPreferredSize(new Dimension(100, 100));
            producto.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
            grid.add(producto);
        }

        grid.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(grid);
    }

    public JPanel getPanel() {
        return this;
    }
}
