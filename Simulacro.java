import javax.swing.JOptionPane;

public class Simulacro {

    public static void main(String[] args) {

        int n = 0;  
        int mayoresEdad = 0; 
        int menoresEdad = 0; 
        int persona = 1;
    
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas a registrar:"));


        for (int i = 0; i < n; i++) {
   

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:"+persona++);
            String documento = JOptionPane.showInputDialog("Ingrese el documento de la persona:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona:"));
            String profesion = JOptionPane.showInputDialog("Ingrese la profesión de la persona:");


            if (edad >= 18) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }


        JOptionPane.showMessageDialog(null, "Cantidad de personas ingresadas: " + n);
        JOptionPane.showMessageDialog(null, "Cantidad de personas mayores de edad: " + mayoresEdad);
        JOptionPane.showMessageDialog(null, "Cantidad de personas menores de edad: " + menoresEdad);
    }
}