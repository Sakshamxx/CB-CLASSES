public class day1 {
    static boolean linearSearch(int[] arr,int n){
        for(var i:arr)
        if(i==n) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        System.out.println(linearSearch(arr, 0));
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
