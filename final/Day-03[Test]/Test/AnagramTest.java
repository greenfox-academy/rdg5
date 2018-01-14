import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  Anagram pista;
  String first;
  String second;

  @Before
  public void setUp() throws Exception {
    pista = new Anagram();
    first = "jóska";
    second = "posta";
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void isItAnagramOrIsItNot() throws Exception {
    assertEquals(false, pista.isItAnagramOrIsItNot(first, second));
  }

}