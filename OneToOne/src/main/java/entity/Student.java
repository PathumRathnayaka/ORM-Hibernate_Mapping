package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.List;
@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private String address;
    @OneToOne
    private Laptop laptop;

    public Student(String id, String name, String address, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.laptop = laptop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
