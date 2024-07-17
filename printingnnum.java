public class printingnnum {
    public static void main(String[] args){
       // int i;
       // Scanner sc= new Scanner(System.in);
        //i =sc.nextInt();
        //while(i<=10){
        //    System.out.println(i);
        //    i++;
    //    for(int i=sc.nextInt(); i<=10; i++){
    //        System.out.println(i);
    //    }
    //    for( int n=1;n <=5;n++){
    //        System.out.print("* ");
    //   }
    //int n=5;
    //for(int i=1;i<=n;i++){
    //    System.out.print("*   ");
    //}
    //System.out.println();
    //for(int i=1;i<=n;i++){
    //    System.out.print(i+"   ");
    //}
    //for(int i =1; i<=n;i++){
    //    for(int j =1; j<=n;j++)
    //    System.out.print("*");
    //    System.out.println();
    //}
    //int n=4;
    //for(int i=1; i<=n;i++) {
    //    for(int j=1;j<=i;j++)
    //    System.out.print("* ");
    //    System.out.println();
    //}
    int n=4;
    for(int i=1;i<=n;i++){
        for(int k=1; k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    //sc.close();
    }
}