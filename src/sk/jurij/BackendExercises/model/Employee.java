package sk.jurij.BackendExercises.model;

public abstract class Employee {
    float salary;
    int bonus;

    public Employee(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public String getInfo(){
        return String.format("%s’s salary is %.2f and bonus is %d", this.getClass().getSimpleName(), salary, bonus);
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
}
