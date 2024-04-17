import java.util.ArrayList;
public class StudentGroup {
    public String nazwa;
    ArrayList<Student> students=new ArrayList<Student>();

    public void AddStudent(Student student) throws Exception {
        if(students.size() <15) {
            this.students.add(student);
        } else {
            throw new IllegalArgumentException();
        }
        if (students.contains(student)) {
            throw new IllegalArgumentException();
        }
    }

}
