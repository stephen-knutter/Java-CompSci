package main;

import java.util.*;

public class ArrayUtils {

  public static int[] reverse(int[] array) {

    int arrLength = array.length;

    for (int i = 0; i < array.length / 2; i++) {
      //[1,2,3,4,5,6] Start
      int temp = array[i];
      array[i] = array[arrLength - i - 1];
      //[6,2,3,4,5,1] 1st
      //[6,5,3,4,2,1] 2nd
      //[6,5,4,3,2,1] 3rd
      array[arrLength - i - 1] = temp;
      // System.out.println("Array: " + Arrays.toString(array));
    }

    return array;
  };

  public static int[] push(int[] array, int num) {
    array = Arrays.copyOf(array, array.length + 1);
    array[array.length - 1] = num;
    return array;
  };

  public static void print(int[] array) {
    System.out.print('[');
    for(int i=0; i<array.length; i++){
      if (i == array.length -1) {
        System.out.print(array[i] + "]");
      } else {
        System.out.print(array[i] + ", ");
      }
    }
    System.out.print('\n');
  };

}
