import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        int action;
        do {
            action = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to add an employee, 2 to pay employees, and 3 to exit program"));
            switch (action){
                case 1:
                    try{
                        employees.add(builder.buildEmp());
                    }catch(IllegalArgumentException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;
                case 2:
                    payEmployees(employees);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid selection");
            }
        }while (action!=3);

    }
    public static void payEmployees(ArrayList<Employee> arr){
        double totalPaid = 0;
        for(Employee e: arr){
            totalPaid+=e.payEmployee();
        }
        JOptionPane.showMessageDialog(null, "You paid "+ totalPaid + " to employees");
    }

}