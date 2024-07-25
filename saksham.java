import java.util.Arrays;

public class saksham {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    static void Printrev(int[] arr){
        for(int a=arr.length-1;a>=0;--a)
            System.out.print(arr[a]+" ");
                System.out.println();
    }
    static void reverse(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++)
            temp[i]=arr[arr.length-1 - i];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    static void swap(int[] arr, int i, int j){
        //
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseUsingSwap(int[] arr){
        for(int i=0,j=arr.length -1;i<j ;j--,i++){
            swap(arr, i, j);
            printArr(arr);
        }
    }
    static boolean linearSearch(int[] arr, int n){
        for(var i:arr)
            if(i==n) return true;
        return false;
    }
    static boolean binarySearch(int[] arr, int n){
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid= (i+j)/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 2));
    }
}
