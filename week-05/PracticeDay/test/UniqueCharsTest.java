import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharsTest {

  ArrayList<String> example;
  ArrayList<String> empty;




  @Before
  public void setUp() throws Exception {
    example = new ArrayList<>(Arrays.asList("k", "m", "n", "c"));
    empty = new ArrayList<>();
  }

  @Test
  public void uniqueCharacters() throws Exception {

    assertEquals(example, UniqueChars.uniqueCharacters("kemence"));
  }

  @Test
  public void uniqueCharacters1() throws Exception {

    assertEquals(empty, UniqueChars.uniqueCharacters(""));
  }

  @Test
  public void uniqueCharacters2() throws Exception {

    assertEquals(empty, UniqueChars.uniqueCharacters("aaaaaaaaaaaaaa"));
  }
}