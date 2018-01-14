import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SummingTest {

  Summing jóska;
  ArrayList<Integer> test;
  ArrayList<Integer> test1;
  ArrayList<Integer> test2;
  ArrayList<Integer> test3;
  ArrayList<Integer> test4;


  @Before
  public void setUp() throws Exception {
    jóska = new Summing();
    test = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    test1 = new ArrayList<>();
    test2 = new ArrayList<>(Arrays.asList(2));
    test3 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 65465464, 7));
//    test4 = new ArrayList<>(null);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void sum() throws Exception {
    assertEquals(15, jóska.sum(test));
  }

  @Test
  public void sum1() throws Exception {
    assertEquals(15, jóska.sum(test1));
  }

  @Test
  public void sum2() throws Exception {
    assertEquals(15, jóska.sum(test2));
  }

  @Test
  public void sum3() throws Exception {
    assertEquals(15, jóska.sum(test3));
  }

  @Test
  public void sum4() throws Exception {
    assertEquals(15, jóska.sum(test4));
  }
}