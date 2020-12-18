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
}
