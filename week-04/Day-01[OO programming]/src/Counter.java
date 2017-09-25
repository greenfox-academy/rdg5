public class Counter {

  int value;
  int originalValue;

  public Counter(int i) {
    this.value = i;
    this.originalValue = i;
  }

  public Counter() {
    this.value = 0;
    this.originalValue = 0;
  }

  public void add(int number) {
    this.value += number;
  }

  public void add() {
    this.value++;
  }

  public int get() {
    return this.value;

  }

  public void reset() {
    this.value = this.originalValue;

  }

  public static void main(String[] args) {
    Counter pista = new Counter();
//    System.out.println(pista.reset());
  }
}
