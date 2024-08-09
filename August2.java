public class August2 {
    static int[] NGER(int[] arr){
        int maxelement = 0;
        int[] NGER= new int[arr.length];
        for(int i=arr.length-1;i>=0;i++){
            NGER[i] = maxelement;
            maxelement=Math.max(arr[i] ,maxelement);
        }
        return NGER;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(NGER(arr));
}
}
