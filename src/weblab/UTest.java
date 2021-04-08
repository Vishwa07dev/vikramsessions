package weblab;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
import java.util.*;
import java.util.ArrayList;
import org.junit.*;

public class UTest {

  @Test
  public void testCountExample() {
    MWSTNode A = new MWSTNode(asList(24, 67, 80), null, null);
    MWSTNode B = new MWSTNode(asList(5, 8, 10), A, null);
    MWSTNode C = new MWSTNode(asList(31, 58), A, null);
    MWSTNode D = new MWSTNode(asList(70), A, null);
    MWSTNode E = new MWSTNode(asList(100, 144), A, null);
    A.setChildren(new LinkedList<>(asList(B, C, D, E)));
    MWSTNode F = new MWSTNode(asList(6), B, null);
    B.setChildren(new LinkedList<>(asList(null, F, null, null)));
    MWSTNode G = new MWSTNode(asList(33, 36, 42, 50), C, null);
    C.setChildren(new LinkedList<>(asList(null, G, null)));
    MWSTNode I = new MWSTNode(asList(71, 72, 74, 77, 78), D, null);
    D.setChildren(new LinkedList<>(asList(null, I)));
    MWSTNode J = new MWSTNode(asList(90), E, null);
    MWSTNode K = new MWSTNode(asList(120), E, null);
    MWSTNode L = new MWSTNode(asList(166), E, null);
    E.setChildren(new LinkedList<>(asList(J, K, L)));
    MWSTNode M = new MWSTNode(asList(32), G, null);
    MWSTNode N = new MWSTNode(asList(35), G, null);
    MWSTNode O = new MWSTNode(asList(40), G, null);
    MWSTNode P = new MWSTNode(asList(47), G, null);
    MWSTNode Q = new MWSTNode(asList(52, 53, 54, 55), G, null);
    G.setChildren(new LinkedList<>(asList(M, N, O, P, Q)));
    MultiWaySearchTree tree = new MultiWaySearchTree(A);
    assertEquals(1, Solution.restrictedCountChildren(tree));
  }

  @Test
  public void testCountEmpty() {
    MultiWaySearchTree tree = null;
    assertEquals(0, Solution.restrictedCountChildren(tree));
    tree = new MultiWaySearchTree(null);
    assertEquals(0, Solution.restrictedCountChildren(tree));
  }

  @Test
  public void testRetrieveExample() {
    MWSTNode A = new MWSTNode(asList(24, 67, 80), null, null);
    MWSTNode B = new MWSTNode(asList(5, 8, 10), A, null);
    MWSTNode C = new MWSTNode(asList(31, 58), A, null);
    MWSTNode D = new MWSTNode(asList(70), A, null);
    MWSTNode E = new MWSTNode(asList(100, 144), A, null);
    A.setChildren(new LinkedList<>(asList(B, C, D, E)));
    MWSTNode F = new MWSTNode(asList(6), B, null);
    B.setChildren(new LinkedList<>(asList(null, F, null, null)));
    MWSTNode G = new MWSTNode(asList(33, 36, 42, 50), C, null);
    C.setChildren(new LinkedList<>(asList(null, G, null)));
    MWSTNode I = new MWSTNode(asList(71, 72, 74, 77, 78), D, null);
    D.setChildren(new LinkedList<>(asList(null, I)));
    MWSTNode J = new MWSTNode(asList(90), E, null);
    MWSTNode K = new MWSTNode(asList(120), E, null);
    MWSTNode L = new MWSTNode(asList(166), E, null);
    E.setChildren(new LinkedList<>(asList(J, K, L)));
    MWSTNode M = new MWSTNode(asList(32), G, null);
    MWSTNode N = new MWSTNode(asList(35), G, null);
    MWSTNode O = new MWSTNode(asList(40), G, null);
    MWSTNode P = new MWSTNode(asList(47), G, null);
    MWSTNode Q = new MWSTNode(asList(52, 53, 54, 55), G, null);
    G.setChildren(new LinkedList<>(asList(M, N, O, P, Q)));
    MultiWaySearchTree tree = new MultiWaySearchTree(A);
    List<Integer> res = Solution.modifiedRetrieveKeys(tree);
    Collections.sort(res);
    assertEquals(asList(8, 36, 53, 58, 67, 72, 144), res);
  }

  @Test
  public void testRetrieveEmpty() {
    MultiWaySearchTree tree = null;
    assertEquals(new ArrayList<>(), Solution.modifiedRetrieveKeys(tree));
    tree = new MultiWaySearchTree(null);
    assertEquals(new ArrayList<>(), Solution.modifiedRetrieveKeys(tree));
  }

  @Test
  public void testSortExample() {
    MWSTNode A = new MWSTNode(asList(24, 67, 80), null, null);
    MWSTNode B = new MWSTNode(asList(5, 8, 10), A, null);
    MWSTNode C = new MWSTNode(asList(31, 58), A, null);
    MWSTNode D = new MWSTNode(asList(70), A, null);
    MWSTNode E = new MWSTNode(asList(100, 144), A, null);
    A.setChildren(new LinkedList<>(asList(B, C, D, E)));
    MWSTNode F = new MWSTNode(asList(6), B, null);
    B.setChildren(new LinkedList<>(asList(null, F, null, null)));
    MWSTNode G = new MWSTNode(asList(33, 36, 42, 50), C, null);
    C.setChildren(new LinkedList<>(asList(null, G, null)));
    MWSTNode I = new MWSTNode(asList(71, 72, 74, 77, 78), D, null);
    D.setChildren(new LinkedList<>(asList(null, I)));
    MWSTNode J = new MWSTNode(asList(90), E, null);
    MWSTNode K = new MWSTNode(asList(120), E, null);
    MWSTNode L = new MWSTNode(asList(166), E, null);
    E.setChildren(new LinkedList<>(asList(J, K, L)));
    MWSTNode M = new MWSTNode(asList(32), G, null);
    MWSTNode N = new MWSTNode(asList(35), G, null);
    MWSTNode O = new MWSTNode(asList(40), G, null);
    MWSTNode P = new MWSTNode(asList(47), G, null);
    MWSTNode Q = new MWSTNode(asList(52, 53, 54, 55), G, null);
    G.setChildren(new LinkedList<>(asList(M, N, O, P, Q)));
    MultiWaySearchTree tree = new MultiWaySearchTree(A);
    assertEquals(asList(5, 6, 8, 10, 24, 31, 32, 33, 35, 36, 40, 42, 47, 50, 52, 53, 54, 55, 58, 67, 70, 71, 72, 74, 77, 78, 80, 90, 100, 120, 144, 166), Solution.getSortedKeys(tree));
  }

  @Test
  public void testSortEmpty() {
    MultiWaySearchTree tree = null;
    assertEquals(new ArrayList<>(), Solution.getSortedKeys(tree));
    tree = new MultiWaySearchTree(null);
    assertEquals(new ArrayList<>(), Solution.getSortedKeys(tree));
  }
}



