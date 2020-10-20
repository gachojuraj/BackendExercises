package sk.jurij.BackendExercises;

import sk.jurij.BackendExercises.model.Driver;
import sk.jurij.BackendExercises.model.Employee;
import sk.jurij.BackendExercises.model.Programmer;
import sk.jurij.BackendExercises.model.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Programmer(10,10));
        list.add(new Teacher(11,10));
        list.add(new Driver(12, 10));
        list.forEach(e -> System.out.println(e.getInfo()));

        EmployeeServiceImpl service = new EmployeeServiceImpl();
        System.out.println(service.getTotalBonuses(list.toArray(new Employee[]{})));
        System.out.println(service.getTotalSalary(list.toArray(new Employee[]{})));
    }
}
