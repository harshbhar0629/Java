public class DS07QuickSort {

    static int partition(int []arr, int lo, int hi){
        int pivot = arr[hi];
        int i = lo-1;
        for(int j=lo; j<hi; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[hi];
        arr[hi] = temp;
        return i+1;
    }

    static void quickSort(int []arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        int []arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        quickSort(arr, 0, n-1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
