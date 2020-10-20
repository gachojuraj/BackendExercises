package sk.jurij.BackendExercises.model;

public class Programmer extends Employee {
    public Programmer(float salary, int bonus) {
        super(salary, bonus);
    }

    @Override
    public String getInfo() {
        return String.format("%s’s salary is %.2f", this.getClass().getSimpleName(), salary+bonus);
    }
}
