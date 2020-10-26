package sk.jurij.BackendExercises.model;

public abstract class Employee {
    float salary;
    int bonus;
    EmployeeType type;

    public Employee(float salary, int bonus, EmployeeType type) {
        this.salary = salary;
        this.bonus = bonus;
        this.type = type;
    }
    public String getInfo(){
        return String.format("%s’s salary is %.2f and bonus is %d", this.type.getName(), salary, bonus);
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
}
