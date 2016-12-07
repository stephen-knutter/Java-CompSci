package main;

import java.util.*;

public class BasicSorting {

  public static int[] bubble(int[] array) {
    int j;
    boolean flag = true;
    int temp;

    while(flag) {
      flag = false;

      for (j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) { //Ascending (Switch to < for Descending)
          temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
          flag = true;
        }
      }
    }

    return array;
  }

  public static int[] selection(int[] array) {
    int i, j, first, temp;
    // {42, 23, 16, 15, 8, 4}
    for (i = array.length - 1; i > 0; i--) {
      first = 0;

      for (j = 1; j <= i; j++) {
        if (array[j] > array[first])
          first = j;
      }

      temp = array[first];
      array[first] = array[i];
      array[i] = temp;
      // {4,23,16,15,8,42} 1st
      // {4,8,16,15,23,42} 2nd
      // {4,8,15,16,23,42} 3rd
      // System.out.print("Array: " + Arrays.toString(array));
    }
    return array;
  }

  public static int[] insertion(int[] array) {
    int j;
    int key;
    int i;

    for (j=1; j < array.length; j++) {
      key = array[j];

      for (i = j - 1; (i >= 0) && (array[i] > key); i--) {
        array[i + 1] = array[i];
      }

      array[i + 1] = key;
    }

    System.out.print("Array: " + Arrays.toString(array));
    return array;
  }

}
