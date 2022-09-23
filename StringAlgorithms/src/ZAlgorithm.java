
public class ZAlgorithm {
    //returns the first index of the pattern if exits otherwise -1
    private static int searchThePattern(String pattern, String search){
        if(pattern.length() > search.length()) return -1;
        String concat = pattern+"$"+search;
        int[] arr = getZArray(concat);
        for(int i=0; i<search.length(); i++){
            if(pattern.length() == arr[i + pattern.length() + 1]){
                return i;
            }
        }
        return -1;
    }
    private static int[] getZArray(String a){
        int n = a.length();
        int[] arr = new int[n];
        arr[0] = n;
        int l=0, r=0;
        for(int i=1; i<n; i++){
            if(i>r){
                l = r = i;
                while(r<n && a.charAt(r)==a.charAt(r-l)){
                    r++;
                }
                arr[i] = r - l;
                r--;
            }else {
                int k = i - l;
                if (arr[k] < r - i + 1) {
                    arr[i] = arr[k];
                } else {
                    l = i;
                    while (r < n && a.charAt(r) == a.charAt(r - l)) {
                        r++;
                    }
                    arr[i] = r - l;
                    r--;
                }
            }
        }

        return arr;
    }
}
