class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int highEl = arr[0];
        int secondHigh = -1;
        for (int i = 1; i < arr.length; i++) {
            if (highEl < arr[i]) {
                secondHigh = highEl; // definetialy the prev one become 2nd bcoz it was 1st now 2nd
                highEl = arr[i];
            } else if (highEl > arr[i] && secondHigh < arr[i]) {
                secondHigh = arr[i];
            }
        }
        return secondHigh;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 }; // Ex out:34
        System.out.println("The second largest element in arr is : " + getSecondLargest(arr));
    }
}