import java.util.*;
public class LinearSearch{
    public static int LinearSearchEx(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int number[]={2,3,6,8,10,12};
        int key=10;
        int index=LinearSearchEx(number,key);
        if(index==-1){
            System.out.println("NOT FOUND");

        }else{
            System.out.println("Key at:"+index);
        }
    }
}