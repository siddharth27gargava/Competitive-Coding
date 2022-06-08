package Recursion;

public class RecIsFirstIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,4,3,4,4,5,5,7,8};
        int data = 4;

        System.out.println(lastIndex(arr,arr.length-1,data));
    }

    public static int firstIndex(int[] arr, int si, int item){
        if (si == arr.length-1){
            return -1;
        }

        if (arr[si] == item){
            return si;
        } else {
            int ans = firstIndex(arr,si+1,item);
            return ans;
        }
    }

    public static int lastIndex(int[] arr, int si, int item){
        if (si == arr.length-1){
            return -1;
        }

        int index = lastIndex(arr, si+1, item);
            if (index == -1){
                if (arr[si] == item){
                    return si;
                } else {
                    return -1;
                }
            } else {
                return index;
            }

    }

}
