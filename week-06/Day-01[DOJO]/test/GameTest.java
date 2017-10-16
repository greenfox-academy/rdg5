import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
  Game pali;


  @Before
  public void setUp() throws Exception {
    pali = new Game();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void main() throws Exception {
    assertEquals("hello",pali.gameStart());

  }

}