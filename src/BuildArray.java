/**
 * Created by adavi on 27.07.2017.
 */
public class BuildArray {

    public int[] arrayBild(int k){
        int [] arr = new int[k];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*(31)-15);
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        return arr;
    }
    public int equalsArray(int arr[]){
        int k = 0;
        int count = 0;
        int i = 0;
        while (i < arr.length){
            if (arr[i] > k){
                k = arr[i];
                count = i;
            }
            i++;
            System.out.println();
        }
       return count;
    }
}
