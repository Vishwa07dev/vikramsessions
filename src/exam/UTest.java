package exam;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class UTest {

  @Test
  public void testHeapifyExampleA() {
    Integer[] data = { 51, 324, 123, 432, 5, 41, 54, 99, 6, 1 };
    assertArrayEquals(new Integer[] { 51, 324, 123, 432, 5, 41, 54, 99, 6, 1 }, data);
    Solution.heapify(data, 0, 2, true);
    assertArrayEquals(new Integer[] { 324, 51, 123, 432, 5, 41, 54, 99, 6, 1 }, data);
    Solution.heapify(data, 3, 5, false);
    assertArrayEquals(new Integer[] { 324, 51, 123, 5, 432, 41, 54, 99, 6, 1 }, data);
    Solution.heapify(data, 6, 9, true);
    assertArrayEquals(new Integer[] { 324, 51, 123, 5, 432, 41, 99, 54, 6, 1 }, data);
  }

  @Test
  public void testHeapifyExampleB() {
    Integer[] data = { 7, 23, 4, 6, 9, 30, 1 };
    assertArrayEquals(new Integer[] { 7, 23, 4, 6, 9, 30, 1 }, data);
    Solution.heapify(data, 0, 2, true);
    assertArrayEquals(new Integer[] { 23, 7, 4, 6, 9, 30, 1 }, data);
    Solution.heapify(data, 3, 6, false);
    assertArrayEquals(new Integer[] { 23, 7, 4, 1, 6, 30, 9 }, data);
  }

  @Test
  public void testHeapifyFullExample() {
    Integer[] data = { 7, 23, 4, 6, 9, 30, 1 };
    assertArrayEquals(new Integer[] { 7, 23, 4, 6, 9, 30, 1 }, data);
    Solution.heapify(data, 0, 6, true);
    assertArrayEquals(new Integer[] { 30, 23, 7, 6, 9, 4, 1 }, data);
    Solution.heapify(data, 0, 6, false);
    assertArrayEquals(new Integer[] { 1, 6, 4, 23, 9, 30, 7 }, data);
    Solution.heapify(data, 0, 6, true);
    assertArrayEquals(new Integer[] { 30, 23, 7, 6, 9, 4, 1 }, data);
  }

  @Test
  public void testHeapSortEmpty() {
    Integer[] data = {};
    Integer[] sorted = {};
    Solution.partitionedInPlaceHeapSort(data);
    assertArrayEquals(sorted, data);
  }

  @Test
  public void testHeapSortPartiallyEmpty() {
    Integer[] data = { 2 };
    Integer[] sorted = { 2 };
    Solution.partitionedInPlaceHeapSort(data);
    assertArrayEquals(sorted, data);
    Integer[] data2 = { 2, 5 };
    Integer[] sorted2 = { 2, 5 };
    Solution.partitionedInPlaceHeapSort(data2);
    assertArrayEquals(sorted2, data2);
  }

  @Test
  public void testHeapSortSmallest() {
    Integer[] data = { 42, 7, 12 };
    Integer[] sorted = { 42, 7, 12 };
    Solution.partitionedInPlaceHeapSort(data);
    assertArrayEquals(sorted, data);
  }

  @Test
  public void testHeapSortSmall() {
    Integer[] data = { 51, 324, 123, 432, 5, 41, 54, 99, 6, 1 };
    Integer[] sorted = { 51, 123, 324, 432, 41, 5, 99, 54, 6, 1 };
    Solution.partitionedInPlaceHeapSort(data);
    assertArrayEquals(sorted, data);
  }
}

