package exaprac2;
import javax.swing.JOptionPane;

public class Exaprac2 {
    public static void main(String[] args) {
        int nCant = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de persona"));
        String nombre[] = new String[nCant];
        Double horaSalario[] = new Double[nCant];
        int horaTrab[] = new int[nCant];
        Double salEmpleado[] = new Double[nCant];
        Double sal;
        sal = 0.0;
        Double salTotal;
        salTotal = 0.0;
        String mayorGana;
        mayorGana="";
        for (int i = 0; i < nCant; i++) {
            nombre[i] = JOptionPane.showInputDialog(null,"Nombre empleado " + (i+1));
            horaSalario[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario x Hora"));
            horaTrab[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trabajadas"));
            salEmpleado[i] = horaSalario[i] * horaTrab[i];
            salTotal += salEmpleado[i];
            if (salEmpleado[i] > sal) {
                sal = salEmpleado[i];
                mayorGana = nombre[i];
            }
        }
        String detallePlanilla = "Empleado          Salario x Hora          Horas Trabajadas           Salario final" + "\n";
        for (int j = 0; j < nCant; j++) {
           detallePlanilla += nombre[j] + "                    " + horaSalario[j] + "                              " + horaTrab[j] + "                              " + salEmpleado[j] + "\n";
        }
        JOptionPane.showMessageDialog(null, detallePlanilla);
        JOptionPane.showMessageDialog(null, "Total de planilla\n" + "Cantidad de empleados: " + nCant + "\nSalario total del mes: " + salTotal);
        JOptionPane.showMessageDialog(null, "Empleado que más gana " + mayorGana);
        
    }
    
}
