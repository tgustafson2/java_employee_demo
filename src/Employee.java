abstract public class Employee {
    protected String name;
    protected int emplID;
    abstract public double payEmployee();
    Employee(String name, int emplID){
        this.name = name;
        this.emplID = emplID;
    }

    public int getEmplID() {
        return emplID;
    }

    public String getName() {
        return name;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
