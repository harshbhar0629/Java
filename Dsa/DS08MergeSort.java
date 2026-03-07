
import java.util.ArrayList;

public class DS08MergeSort {
    static void mergeAll(int []arr, int lo, int mid, int hi){
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        for(int i=lo; i<=mid; i++){
            a1.add(arr[i]);
        }
        for (int i = mid+1; i <= hi; i++) {
            a2.add(arr[i]);
        }

        int i = 0, j = 0, k = lo;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i) <= a2.get(j)){
                arr[k] = a1.get(i);
                i++;
            }
            else{
                arr[k] = a2.get(j);
                j++;
            }
            k++;
        }

        while (i < a1.size() ) {
            arr[k] = a1.get(i);
            i++;
            k++;
        }

        while (j < a2.size()) {
            arr[k] = a2.get(j);
            j++;
            k++;
        }
    
    }

    static void mergeSort(int []arr, int lo, int hi){
        if(lo>=hi) return;
        int mid = (lo+hi)/2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid+1, hi);
        mergeAll(arr, lo, mid, hi);
    }

    public static void main(String[] args) {
        int []arr = {90,2,42,24,2,24,56,3,5};
        int n = arr.length;
        System.out.println("Before Sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        mergeSort(arr, 0, n-1);

        System.out.println("After Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
