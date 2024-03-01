package entity;

import java.util.List;

public class Laptop {
    private String id;
    private String model;
    private List<Student> students;

    public Laptop() {
    }

    public Laptop(String id, String model, List<Student> students) {
        this.id = id;
        this.model = model;
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
