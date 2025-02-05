package main.java.binarysearch;

public class Searchin2D {
    public static boolean binary(int[][] arr, int key){
        int n = arr.length;
        int m = arr[0].length;
        int l = 0, r = n * m - 1;
        boolean found = false;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / m;
            int col = mid % m;

            if (arr[row][col] == key) {
                found = true;
                System.out.println("Element found at: (" + row + ", " + col + ")");
                break;
            } else if (arr[row][col] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int key = 9;

        if (!binary(arr,key)) {
            System.out.println("Element Not Found");
        }
    }
}
