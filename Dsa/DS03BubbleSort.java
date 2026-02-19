public class DS03BubbleSort {
    static void print(int []arr, int n){
        for(int i=0; i<n; i++){ 
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    static void bubbleSort(int []arr, int n) {
        for(int i=1; i<n-1; i++){
            for(int j=0; j<=i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("At i = "+i);
            print(arr, n);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int []arr = {4,5,8, 6, 7};
        bubbleSort(arr, n);
    }
}
