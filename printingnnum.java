import java.util.Scanner;
public class printingnnum {
    public static void main(String[] args){
        int i;
        Scanner sc= new Scanner(System.in);
        i =sc.nextInt();
        while(i<=10){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}