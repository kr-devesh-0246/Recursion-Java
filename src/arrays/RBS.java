/*
This is a special case of Binary search where rotation
I have to finish Binary Search from playlist to understand this. As it avoids many redundant test
cases
*/
package arrays;

public class RBS {
    public static int rotatedsearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] < arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rotatedsearch(arr, target, s, m-1);
            } else {
                return rotatedsearch(arr, target, m+1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]) {
            return rotatedsearch(arr, target, m+1, e);
        }
        return rotatedsearch(arr, target, s, m-1);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        rotatedsearch(arr, 3, 0, 7);
    }
}
