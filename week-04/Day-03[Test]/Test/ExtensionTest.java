import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(9, extension.add(6, 3));
  }

  @Test
  void testAdd_1and4is5() { assertEquals(6, extension.add(2, 4)); }

  @Test
  void testMaxOfThree_first() {
    assertEquals(1, extension.maxOfThree(1, 0, 0));
  }

  @Test
  void testMaxOfThree_third() { assertEquals(155, extension.maxOfThree(3, 99, 155)); }

  @Test
  void testMedian_four() { assertEquals(5, extension.median(Arrays.asList(7,5,3,5))); }

  @Test void testMedian_five() { assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5))); }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
