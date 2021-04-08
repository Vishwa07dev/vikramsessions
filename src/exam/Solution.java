package exam;

class Solution {

  /**
   * Swaps two elements in an array.
   *
   * @param T
   *     The array to swap elements in.
   * @param i
   *     Position of element to swap in T.
   * @param j
   *     Position of element to swap in T.
   */
  public static void swap(Integer[] T, int i, int j) {
    Integer t = T[i];
    T[i] = T[j];
    T[j] = t;
  }

  /**
   * Restores the heap property in a heap represented as an array.
   * When the heap property is invalid at root,
   * the method fixes the heap first locally before fixing the affected subtree.
   *
   * @param T Array containing the subarray that represents the heap, which might be invalidated.
   * @param root Index of the root of the heap, which might be a subtree of the overall heap.
   * @param start First index of the subarray where this heap is located (inclusive)
   * @param end Last index of the subarray where this heap is located (inclusive)
   * @param isMaxHeap True if this heap is a max heap, else false
   */
  public static void downHeap(Integer[] T, int root, int start, int end, boolean isMaxHeap) {
    // index of left and right children
    int left = start + 2 * (root - start) + 1;
    int right = start + 2 * (root - start) + 2;
    int correctRoot = root;
    if (left <= end && ((T[left] > T[root] && isMaxHeap) || (T[left] < T[root] && !isMaxHeap)))
      correctRoot = left;
    if (right <= end && ((T[right] > T[correctRoot] && isMaxHeap) || (T[right] < T[correctRoot] && !isMaxHeap)))
      correctRoot = right;
    // heap property invalid at root
    if (correctRoot != root) {
      swap(T, root, correctRoot);
      downHeap(T, correctRoot, start, end, isMaxHeap);
    }
  }

  /**
   * Turns a subarray of integers into a heap.
   * This is an in-place algorithm, the heap is built in the array itself.
   *
   * @param T Array containing the subarray that needs to be heapified.
   * @param start First index of the subarray (inclusive)
   * @param end Last index of the subarray (inclusive)
   * @param isMaxHeap True if this heap needs to be a max heap, else false
   */
  public static void heapify(Integer[] T, int start, int end, boolean isMaxHeap) {
    int startI = ((end - start + 1)/2)-1;
    for(int i = startI; i >= 0; i--){
      downHeap(T, i, start, end, isMaxHeap);
    }

  }

  /**
   * Sorts an array of integer numbers using partitioned in place heap sort.
   * This is an in-place algorithm, the elements inside the array are being sorted without creating a copy of the array.
   *
   * @param T
   *     An array of integer numbers.
   *     On return, this array is sorted.
   */
  public static void partitionedInPlaceHeapSort(Integer[] T) {
    // TODO
  }
}


