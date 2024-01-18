public class Salaried extends Employee{
    private double salary;
    Salaried(String name, int emplID, double salary){
        super(name, emplID);
        this.salary = salary;
    }

    @Override
    public double payEmployee() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
