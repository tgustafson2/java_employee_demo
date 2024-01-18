import javax.swing.*;

public class Hourly extends Employee{
    private double payRate;
    Hourly(String name, int emplID, double payRate){
        super(name, emplID);
        this.payRate = payRate;
    }

    @Override
    public double payEmployee() {
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter employee "+ getEmplID() +" hours worked"));
        return hoursWorked*getPayRate();
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
