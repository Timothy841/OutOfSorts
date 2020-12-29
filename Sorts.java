import java.util.Arrays;

public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean c = false;
    for (int i = 0;i<data.length;i++){
      c = false;
      for (int j = 0;j<data.length-i-1;j++){
        if (data[j]>data[j+1]){
          int a = data[j];
          data[j]=data[j+1];
          data[j+1]=a;
          c = true;
        }
      }
      if (c==false){
        break;
      }
      //System.out.println(Arrays.toString(data));
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0 ; i< data.length ; i++){
      int a = i;
      for (int j = i; j< data.length ; j++){
        if (data[j]<data[a]){
          a = j;
        }
      }
      if (a != i){
        int b = data[i];
        data[i] = data[a];
        data[a] = b;
      }
      //System.out.println(Arrays.toString(data));
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i<data.length;i++){
      int a = data[i];
      int j = i-1;
      while(j>=0 && data[j]>a){
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = a;
    }
  }
}
