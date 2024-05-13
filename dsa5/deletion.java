package dsa5;

public class deletion {
    static void deleteelement(int [] arr, int item){
        int [] temp = new int[arr.length-1];
        if(i>=arr.length){
            System.out.println("INDEX IS OUT OF BOUNDS");
        }
        else{
                System.arraycopy(arr, 0, temp, 0, item-1);
                System.arraycopy(arr, item+1, arr, item + 1, temp.length - item);
            }
        }
    }


