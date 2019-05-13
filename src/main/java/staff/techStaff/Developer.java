package staff.techStaff;
import staff.Employee;

public class Developer extends Employee {
    public Developer(String name, int NiN, double salary){
        super(name, NiN, salary);
    }


    public double raiseSalary(int number){
        if (number > 0){
            return getSalary() + number;
        }
        return -1;
    }

    @Override
    public double payBonus(int number) {
        return number;
    }
}
