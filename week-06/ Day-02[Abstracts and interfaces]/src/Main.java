public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    Student jóska = new Student("Lakatos József", 20, "male", "BME");
    Student jóskaTheClone = (Student) jóska.clone();
  }
}
