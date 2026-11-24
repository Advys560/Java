
package Guia_1.Ejercicios_8_14;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        String usuario = JOptionPane.showInputDialog(null, "Ingrese el usuario:");
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
}
