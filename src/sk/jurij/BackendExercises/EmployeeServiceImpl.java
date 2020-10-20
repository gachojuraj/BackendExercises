package sk.jurij.BackendExercises;

import sk.jurij.BackendExercises.model.Employee;
import java.util.Arrays;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public float getTotalSalary(Employee[] list) {
        return (float) Arrays.stream(list).mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public int getTotalBonuses(Employee[] list) {
        return Arrays.stream(list).mapToInt(Employee::getBonus).sum();
    }
}
