import java.util.*;
public class Pattern7{
    public void printpattern(int n){
        for(int i=0;i<=n;i++){
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
        Pattern7 p=new Pattern7();
        p.printpattern(n);
    }
}