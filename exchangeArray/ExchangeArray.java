package exchangeArray;

import java.util.Arrays;

/**
 * 给定两个整型数组, 交换两个数组的内容.
 */
public class ExchangeArray {
    private int[] array;
    public ExchangeArray(int[] arr) {
        this.array = arr;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    public void method(int[] arr) {
       for (int i=0;i<array.length;i++){
           int tmp=this.array[i];
           this.array[i]= arr[i];
           arr[i]=tmp;
       }
    }
}
