package sk.jurij.BackendExercises.model;

public enum EmployeeType {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    private final String name;

    EmployeeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
