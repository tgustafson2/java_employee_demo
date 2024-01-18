import javax.swing.*;

public class Commision extends Employee{
    private double commisionRate;
    Commision(String name, int emplID, double rate){
        super(name, emplID);
        this.commisionRate = rate;
    }

    @Override
    public double payEmployee() {
        double sales = Double.parseDouble(JOptionPane.showInputDialog("Enter employee " + getEmplID() + " sales for the period"));
        return sales*getCommisionRate();
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }
}
