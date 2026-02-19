public class DS05InsertionSort {
    static void print(int []arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    static void insertionSort(int []arr, int n){
        for(int i=1; i<n; i++){
            int j=i-1;
            int val = arr[i];
            while(j>=0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
            System.out.println("At i = "+i);
            print(arr, n);
        } 
    }
    public static void main(String[] args) {
        int n = 5;
        int []arr = {1,5,2,4,0};
        insertionSort(arr, n);
    }
}
