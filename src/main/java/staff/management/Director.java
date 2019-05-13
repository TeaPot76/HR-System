package staff.management;


public class Director extends Manager {

    private double budget;

    public Director(String name, int NiN, double salary, String depName, double budget){
        super(name, NiN, salary, depName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus(int number) {

        return super.payBonus(number) + 0.02*number;

    }
}
