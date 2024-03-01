import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.setId("S001");
        student1.setName("Pathum");
        student1.setAddress("kadawatha");

        Student student2=new Student();
        student2.setId("S002");
        student2.setName("Thilina");
        student2.setAddress("colombo");

        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Laptop laptop1 = new Laptop();
        laptop1.setId("D010");
        laptop1.setModel("hp");
        laptop1.setStudents(students);

        Laptop laptop2 = new Laptop();
        laptop2.setId("D020");
        laptop2.setModel("Dell");
        laptop2.setStudents(students);

        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(laptop1);
        laptops.add(laptop2);

        student1.setLaptops(laptops);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

    }
}
