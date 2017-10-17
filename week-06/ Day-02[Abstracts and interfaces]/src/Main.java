public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

//    Student jóska = new Student("Lakatos József", 20, "male", "BME");
//    Student jóskaTheClone = (Student) jóska.clone();

    Gnirts g = new Gnirts("example");
    System.out.println(g.length());
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(0,4));
  }
}
