package staff;

public abstract class Employee {
    private String name;
    private int NiN;
    private double salary;

    public Employee(String name, int niN, double salary) {
        this.name = name;
        NiN = niN;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiN() {
        return NiN;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }

    public void setNiN(int niN) {
        NiN = niN;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double raiseSalary(int number);


    public abstract double payBonus(int number);


}
