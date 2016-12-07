package main;

import java.util.*;

public class AdvancedSorting {

  public static int[] mergesort(int[] array) {
    int[] result = mergesort_splitter(array);
    return result;
  }

  public static int[] mergesort_splitter(int[] array) {
    if (array.length <= 1) {
      return array;
    }

    int pivot = (int)Math.floor((array.length - 1) / 2);
    int[] left = Arrays.copyOfRange(array, 0, pivot + 1);
    int[] right = Arrays.copyOfRange(array, pivot + 1, array.length);
    System.out.println("left: " + Arrays.toString(left));
    System.out.println("right: " + Arrays.toString(right));
    
    return mergesort_joiner(mergesort_splitter(left), mergesort_splitter(right)); // AFTER RIGHT & LEFT RUN RETURNS FINAL ARRAY
  }

  public static int[] mergesort_joiner(int[] left, int[] right) {
    int[] joined = new int[left.length + right.length];

    int leftCursor = 0;
    int rightCursor = 0;
    int joinCursor = 0;

    while(joinCursor < joined.length) {
      if (leftCursor >= left.length) {
        joined[joinCursor] = right[rightCursor];
        rightCursor++;
      } else if (rightCursor >= right.length) {
        joined[joinCursor] = left[leftCursor];
        leftCursor++;
      } else {
        joined[joinCursor] = right[rightCursor++];
      }
      joinCursor++;
    }

    System.out.println("joined: " + Arrays.toString(joined));
    return joined;
  }

  public static int[] quicksort(int[] array) {
    return array;
  }

}
