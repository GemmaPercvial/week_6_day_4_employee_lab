package Management;

public class Director extends Manager{
    private double budget;

    public Director(String name, int niNumber, double salary, String departmentName, double budget){
        super(name, niNumber, salary, departmentName);
        this.budget = budget;
    }


    public double getBudget(){
        return this.budget;
    }

    @Override
    public double payBonus(){
        return super.payBonus() * 2;
    }
}
