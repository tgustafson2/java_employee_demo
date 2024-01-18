import javax.swing.*;

public class EmployeeBuilder {
    public Employee buildEmp(){
        Employee emp;
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for a Hourly Employee, 2 for a Salary Employee, and 3 for a Commission Employee"));
        emp = switch (choice) {
            case 1 -> buildHour();
            case 2 -> buildSal();
            case 3 -> buildCom();
            default -> throw new IllegalArgumentException("Invalid selection");
        };
        return emp;
    }
    private Salaried buildSal(){
        String name = JOptionPane.showInputDialog("Enter employee's name");
        int emplID = Integer.parseInt(JOptionPane.showInputDialog("Enter employee ID"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter employee salary for a pay period"));
        return new Salaried(name,emplID,salary);

    }
    private Hourly buildHour(){
        String name = JOptionPane.showInputDialog("Enter employee's name");
        int emplID = Integer.parseInt(JOptionPane.showInputDialog("Enter employee ID"));
        double payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter employee hourly rate"));
        return new Hourly(name,emplID,payRate);
    }
    private Commision buildCom(){
        String name = JOptionPane.showInputDialog("Enter employee's name");
        int emplID = Integer.parseInt(JOptionPane.showInputDialog("Enter employee ID"));
        double commissionRate = Double.parseDouble(JOptionPane.showInputDialog("Enter employee commission rate"));
        return new Commision(name,emplID,commissionRate);
    }
}
