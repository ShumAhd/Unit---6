package ro.shum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListComparatorTest {
  @Test
  public void testCompareLists() {
    List<Integer> list1 = Arrays.asList(1, 2, 3);
    List<Integer> list2 = Arrays.asList(4, 5, 6);

    ListComparator comparator = new ListComparator();
    String result = comparator.compareLists(list1, list2);

    Assertions.assertEquals("Второй список имеет большее среднее значение", result);
  }
}

