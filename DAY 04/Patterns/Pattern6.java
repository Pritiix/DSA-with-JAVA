import java.util.*;
public class Pattern6{
    public void printpattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        Pattern6 p=new Pattern6();
        p.printpattern(n);
    }
}