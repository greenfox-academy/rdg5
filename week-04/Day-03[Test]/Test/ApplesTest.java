import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Objects;
import org.junit.Test;

public class ApplesTest {

  Apples apples;

  @Before
  public void setUp() throws Exception {
    apples = new Apples();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void getApple() throws Exception {
    assertEquals("béla", apples.getApple());
  }
}


