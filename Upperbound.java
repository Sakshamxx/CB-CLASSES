public class Upperbound {
    static int UpperBound(int[] arr,int num){
        int ans=-1;
        int low=0, high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==num){
                ans=mid-1;
                low=mid-1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else
            low=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num=3;
        int[] arr={1,1,2,2,3,3,4,4,5,5,6,6,7};
        System.out.println(UpperBound(arr, num));
    }
}
