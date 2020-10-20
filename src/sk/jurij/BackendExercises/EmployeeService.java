package sk.jurij.BackendExercises;

import sk.jurij.BackendExercises.model.Employee;

public interface EmployeeService {
    float getTotalSalary(Employee[] list);
    int getTotalBonuses(Employee[] list);
}
