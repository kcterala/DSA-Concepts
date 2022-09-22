public class MergeSortImpl {

    private void mergeSort(int[] arr, int l, int r){
        if(l==r){
            return;
        }
        int mid = l + (r-l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    private void merge(int[] arr, int l, int y, int r){
        int i = l;
        int j = y+1;
        int k = 0;
        int[] res = new int[r-l+1];

        while(i<=y && j<= r){
            if(arr[i]<=arr[j]){
                res[k++] = arr[i++];
            }else{
                res[k++] = arr[j++];
            }
        }
        while(i<=y){
            res[k++] = arr[i++];
        }
        while(j<=r){
            res[k++] = arr[j++];
        }

        for(int p = l; p <= r; p++) {
            arr[p] = res[p - l];
        }
    }
}
