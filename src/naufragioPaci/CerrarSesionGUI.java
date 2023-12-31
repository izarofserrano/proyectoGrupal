package naufragioPaci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CerrarSesionGUI {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Cerrar Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Etiqueta de bienvenida
        JLabel bienvenidaLabel = new JLabel("Bienvenido, Usuario");

        // Botón de Cerrar Sesión
        JButton cerrarSesionButton = new JButton("Cerrar Sesión");

        // Agregar componentes al frame
        frame.add(bienvenidaLabel);
        frame.add(cerrarSesionButton);

        // Acción del botón "Cerrar Sesión"
        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes implementar la lógica para cerrar la sesión
                // Puedes mostrar un mensaje de despedida o redirigir al usuario a la pantalla de inicio de sesión, por ejemplo.
                JOptionPane.showMessageDialog(frame, "Sesión cerrada. ¡Hasta pronto!");
                // En una aplicación real, deberías redirigir al usuario a la pantalla de inicio de sesión o realizar otras acciones necesarias.
                frame.dispose(); // Cierra la ventana actual
            }
        });

        // Mostrar el frame
        frame.setVisible(true);
    }
}

