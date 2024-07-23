public class functions {
        //create a function named swap: Swap 2 values.
        // create a function to print first n natural numbers
        // create a function to check if a number n is prime or not.
        // Return the inverse of a number n.n=0001549 return: 9451
        // Return number of digits present in a number n. n=1234 return: 4
        // Check if a number is armstrong or not.
    
        
        
        /*
         * swap(int a, intb){
         * //code
         * }
         */
//        static void swap(int a, int b){
//            int temp=a;
//            a=b;
//            b=temp;
            // System.out.print(a+" "+b);
//        }
        
        
//        static void printN(int n){
//            for(int i=1;i<=n;i++){
//                System.out.print(i+" ");
//            }
//        }
//        static void sayHi(String s){
//            //code
//            System.out.println(s);
//        }
//        static boolean checkPrime(int n){
//            for(int i=2; i<n ;i++)
//            if( n%i == 0) return false;
//            return true;
//        }
    static int reverseNum(int n){
    int temp=0;
    while (n!=0){
        temp=temp*10 + n%10;
        n/=10;
    }
    return temp;
}
static int checkDigit(int n) {
    int count=0;
    while(n!=0){
        n/=10;
        count++;
    }
    return count;
}
static boolean checkarm(int n) {
    int d=checkDigit(n);
    int sum=0;
    int temp=n;
    while(n!=0){
    sum+=Math.pow((n%10),d);
    n/=10;
}
return (sum==temp) ;
}
static void printArr(int[] arr){
    for(int i=0;i<=arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

        public static void main(String[] args){
            // sayHi("Hello Gaurav");
            //int a=371;
            //System.out.println(checkarm(a));
            //System.out.println(checkDigit(a));
            //System.out.println(reverseNum(a));
            //printN(a);
            // swap(a, b);
            // System.out.println(a+" "+b);
            // System.out.println("Hi");
            //System.out.println(checkPrime(a));
            int[] arr= new int[10];
        int[] nums= {1, 2, 3, 4, 5, 6};
        // nums=arr; //shallow copy
        arr[0]=1;
        arr[1]=2;
        for(int i=0;i<arr.length;i++)
            arr[i]=i+1;
        printArr(arr);
        // System.out.println(arr);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //for each loop
        
        }
}

