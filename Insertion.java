public class InsertionSort {

  public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] array = {10, 2, 9, 1, 5, 8, 6, 7, 3, 4};
    insertionSort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
