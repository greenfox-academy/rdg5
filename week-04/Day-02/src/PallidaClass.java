import java.util.ArrayList;
import java.util.List;

public class PallidaClass {

  String classname;
  List<Student> students;
  List<Mentor> mentors;

  public PallidaClass(String classname) {
    this.classname = classname;
    students  = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);

  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);

  }

  public void info() {
    System.out.println(
        "Pallida" + classname + " class has " + students.size() + " students and " + mentors.size()
            + " mentors.");
  }
}
