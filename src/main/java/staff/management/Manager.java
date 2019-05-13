package staff.management;
import staff.Employee;

public class Manager extends Employee {

    private String depName;

    public Manager(String name, int NiN, double salary, String depName) {
        super(name, NiN, salary);
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }


    public void setDepName(String depName) {
        this.depName = depName;
    }

    public double raiseSalary(int number) {
        if (number > 0){
            return getSalary() + number;
        }
        return -1;
    }

    public double payBonus(int number) {

            return number;

    }

}
