
public class RotateByDPlace {

    static void printArrr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateArr(int arr[], int d) {
        // add your code here
        int temp[] = new int[d];
        int j = 0;
        int n = arr.length;
        // store all first elms to temp under d
        for (int i = 0; i < d; i++) {
            temp[j] = arr[i];
            j++;
        }
        // shifting rest of the elms from 0th index
        j = 0;
        for (int i = d; i < n; i++) {
          arr[i-d] = arr[i]; //3th to 0th and so on
        }
        //copying back the temp arr into original
        for(int i=n-d; i<arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
    }
    //right rotate

    class Solution {
        static void rotate(int arr[], int k) {
            int n = arr.length;
    
            // Ensure k is within array bounds
            k = k % n;
    
            // Temporary array to store the last k elements
            int temp[] = new int[k];
    
            // Store the last k elements in temp
            for (int i = 0; i < k; i++) {
                temp[i] = arr[n - k + i];//storing all right elms after n-k+1 i.e from 4 for k = 3
            }
    
            // Shift the first n - k elements to the right
            for (int i = n - k - 1; i >= 0; i--) {
                arr[i + k] = arr[i];
            }
    
            // Copy the elements from temp back to the front
            for (int i = 0; i < k; i++) {
                arr[i] = temp[i];
            }
        }
    }
    
    

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int d = 3;
        rotateArr(arr, d);
        printArrr(arr);
        System.out.println();
    }
}
