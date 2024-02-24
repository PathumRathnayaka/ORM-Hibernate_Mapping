import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        Laptop laptop = new Laptop();
        laptop.setId("D001");
        laptop.setModel("Dell");

        laptop.setId("D002");
        laptop.setModel("hp");

        student.setId("S001");
        student.setName("Pathum");
        student.setAddress("Anuradhpura");

        student.setId("S002");
        student.setName("thilina");
        student.setAddress("panadura");

        student.setLaptop(laptop);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(laptop);

        transaction.commit();
        session.close();
    }
}
