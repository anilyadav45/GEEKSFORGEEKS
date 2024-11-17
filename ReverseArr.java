class ReverseArr {
    static void printArrr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static  void reverseArray(int arr[]) {
        // code here
        int n = arr.length / 2;

        int high = arr.length - 1;

        for (int i = 0; i < n; i++) {
            // swap last and first
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,4,3,2,6,5};
        reverseArray(arr);
        printArrr(arr);
    }
}