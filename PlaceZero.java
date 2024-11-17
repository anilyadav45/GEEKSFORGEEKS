
class PlaceZero {
    static void printArrr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void pushZerosToEnd(int[] arr) {
        int temp[] = new int[arr.length];
        int j = 0;
        int count = 1;
        // code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
                count++; //to see no.of elms got placed
            } 
        }
        // copying to original array
        j = 0;
        for (int i = 0; i < arr.length; i++) {
           if(i<=count){
            arr[i] = temp[j];
            j++;
           } //all the temp elms should be place to arr till non zero
            if(j>=count){
                arr[i] = 0; //after all non zero placed we know the remaining are 0 so place it
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr);
        printArrr(arr);
    }
}