import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();

        laptop1.setId("D001");
        laptop1.setModel("Dell");
        laptop1.setStudent(student1);

        laptop2.setId("D002");
        laptop2.setModel("hp");
        laptop2.setStudent(student1);

        student1.setId("S001");
        student1.setName("Pathum");
        student1.setAddress("Anuradhpura");

        student2.setId("S002");
        student2.setName("thilina");
        student2.setAddress("panadura");

        List<Laptop>laptops=new ArrayList<Laptop>();
        laptops.add(laptop1);
        laptops.add(laptop2);

        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();
        session.save(student1);
        for (Laptop laptop : laptops) {
            session.save(laptop);
        }

        transaction.commit();
        session.close();
    }
}
