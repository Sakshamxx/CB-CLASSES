public class TC {
    //public static void main(String[] args) {
    //    int n=4;
    //    for(int i=1;i<=n;i++)
    //    System.out.println("HI");
    //for(int i=1;i<=n;i++){
    //    for(int j=1;j<=n;j+=i){
    //        System.out.println(" * ");
    //    }
    //}
    //for(int i=1;i<=n;i++){
    //    for(int j=1;j<=i*i;j++){
    //        for(int k=1;k<=n/2;k++)
    //            System.out.println("HI");
    //        }
    //    }
    //}
//}
static int[] NGER(int[] arr){
    int maxelement = 0;
    int[] NGER= new int[arr.length];
    for(int i=arr.length-1;i>=0;i++){
        NGER[i] = maxelement;
        maxelement=Math.max(arr[i] ,maxelement);
    }
    return NGER;
}
}
