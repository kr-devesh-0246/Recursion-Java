package intro;

public class BS {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        System.out.println(binSearch(arr, target, 0, arr.length-1));
    }

    public static int binSearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }
        int m = s + (e - s)/2;
        if(target == arr[m]) {
            return m;
        }
        if(target < arr[m]) {
            return binSearch(arr, target, s, m-1);
        }
        return binSearch(arr, target, m+1, e);
    }
}
