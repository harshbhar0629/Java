public class DS04SelectionSort {
    public static void print(int []arr, int n){
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void selectionSort(int []arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("At i = "+i);
            print(arr, n);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int []arr = {1,6,7,2,5};
        selectionSort(arr, n);

    }
}
