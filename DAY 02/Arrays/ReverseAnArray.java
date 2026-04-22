package Arrays;
import java.util.*;
public class ReverseAnArray{
    public static int ReverseArrayEx(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[first];
            number[first]=number[last];
            number[last]=temp;
            first++;
            last--;
        }
        return 0;
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        ReverseArrayEx(number);
        System.out.println("Reversed Array is: "+Arrays.toString(number));
    }
}