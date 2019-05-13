package staff.techStaff;
import staff.Employee;

public class DataBaseAdmin extends Employee {
    public DataBaseAdmin(String name, int NiN, double salary){
        super(name, NiN, salary);
    }

    public double raiseSalary(int number){
        if (number > 0){
            return this.getSalary() + number;
        }
        return -1;

    }

    @Override
    public double payBonus(int number) {
        return number;
    }
}
