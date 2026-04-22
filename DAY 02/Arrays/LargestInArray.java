package Arrays;
import java.util.*;
public class LargestInArray{
    public static int getLargest(int numbers[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(Largest<numbers[i]){
                Largest=numbers[i];
            }
        }        return Largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        System.out.println("Largest in Array is: "+getLargest(numbers));
    }
}