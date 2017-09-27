import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

  Fibonacci ottokár;
  int n;

  @Before
  public void setUp() throws Exception {
    ottokár = new Fibonacci();
    n = 8;
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void fiboingIt() throws Exception {
    assertEquals(377, ottokár.fiboingIt(14));
  }
}