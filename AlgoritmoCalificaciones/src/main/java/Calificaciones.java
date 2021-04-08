
import javax.swing.JOptionPane;

public class Calificaciones {

    public static void main(String[] args) {

        int calif1, calif2, calif3;
        double prom;

        calif1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1era Calificacion"));
        calif2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la 2da Calificacion"));
        calif3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la 3ra Calificacion"));

        prom = (calif1 + calif2 + calif3) / 3.0;

        if (prom >= 6.00) {
            JOptionPane.showMessageDialog(null, "Alumno Aprobado!!");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno Desaprobado");
        }
    }
}
