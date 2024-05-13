package dsa4;

public class merge {
    static void mergeSort(int[] arr) {
        if(arr.length <= 1) {
            return;
        }
        int mid=arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length-mid);
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right)


    }
    static void merge(int [] array, int[] left, int [] right){
        int i = 0, j = 0,k=0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                array[k++] = left[i++];

            }
            else{
                array[k++] = right[j++];
            }
        }
        while(i < left.length){
            array[k++] = left[i++];
        }
        while(j < right.length){
            array[k++] = right[j++];
        }
    }
}
