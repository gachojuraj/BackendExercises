package sk.jurij.BackendExercises.classes;

public class Person {
    String name;
    int age;
    int budget;

    public Person(String name, int age, int budget){
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public int getBudget(){
        return budget;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
