import java.util.*;
public class Pattern8{
    public void printpattern(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        Pattern8 p=new Pattern8();
        p.printpattern(n);
    }
}