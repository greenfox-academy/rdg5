public class Student implements Cloneable {

  String previousOrganization;
  int skippedDays;
  private String name;
  int age;
  String gender;

  public Student(String name, int age, String gender, String previousOrganization) {
//
  }

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out
        .println("Hi, I'm " + name +
            " , a " + age + " year old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }


  protected Object clone() throws CloneNotSupportedException{
    return super.clone();
  }

}