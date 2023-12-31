package naufragioPaci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfiguracionJuegoGUI {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Configuración del Juego");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2));

        // Etiqueta de dificultad
        JLabel dificultadLabel = new JLabel("Dificultad:");

        // Selector de dificultad
        String[] dificultades = {"Fácil", "Medio", "Difícil", "Personalizable"};
        JComboBox<String> dificultadComboBox = new JComboBox<>(dificultades);

        // Etiqueta de tamaño de matriz
        JLabel tamañoMatrizLabel = new JLabel("Tamaño de la matriz (n x n):");
        JTextField tamañoMatrizField = new JTextField();

        // Etiqueta de color de barcos
        JLabel colorBarcosLabel = new JLabel("Color de los barcos:");
        JComboBox<String> colorBarcosComboBox = new JComboBox<>(new String[]{"Rojo", "Azul", "Verde", "Personalizable"});

        // Etiqueta de temática del juego
        JLabel tematicaLabel = new JLabel("Temática del juego:");
        JComboBox<String> tematicaComboBox = new JComboBox<>(new String[]{"Piratas", "Espacio", "Submarinos"});

        // Botón de inicio del juego
        JButton iniciarJuegoButton = new JButton("Iniciar Juego");

        // Agregar componentes al frame
        frame.add(dificultadLabel);
        frame.add(dificultadComboBox);
        frame.add(tamañoMatrizLabel);
        frame.add(tamañoMatrizField);
        frame.add(colorBarcosLabel);
        frame.add(colorBarcosComboBox);
        frame.add(tematicaLabel);
        frame.add(tematicaComboBox);
        frame.add(iniciarJuegoButton);

        // Acción del botón "Iniciar Juego"
        iniciarJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dificultad = (String) dificultadComboBox.getSelectedItem();
                String tamañoMatriz = tamañoMatrizField.getText();
                String colorBarcos = (String) colorBarcosComboBox.getSelectedItem();
                String tematica = (String) tematicaComboBox.getSelectedItem();

                // Aquí puedes tomar las selecciones del usuario y usarlas para iniciar el juego.
                JOptionPane.showMessageDialog(frame, "Dificultad: " + dificultad + "\nTamaño de matriz: " + tamañoMatriz + "\nColor de barcos: " + colorBarcos + "\nTemática: " + tematica);

                // Implementa la lógica del juego aquí, utilizando las selecciones del usuario.
            }
        });

        // Mostrar el frame
        frame.setVisible(true);
    }
}

