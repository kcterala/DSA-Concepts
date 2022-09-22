public class BinarySearchImpl {
    //Return the target position, if it is in the array
    // Or Return the insert Position.
    private static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid]> target){
                high = mid - 1;
            }else if(arr[mid]< target){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return high+1;
    }
}
