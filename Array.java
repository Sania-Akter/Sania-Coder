import java.util.*;
public class Array {
    public static void main(String[] args){
        Random random = new Random();
        int arr[]=new int[10];
        System.out.println("Array of Random Numbers are: ");
        for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(50);
        System.out.println(arr[i]);
        }
        System.out.println("Elements at even index:");
        for (int i = 0; i < arr.length; i++) {
        if(i%2==0){
         System.out.println(arr[i]+" at :"+i);
        }
        }
        System.out.println("Elements which are even:");
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2==0){
        System.out.println(arr[i]);
        }
        }
        System.out.println("On reversing, Array changes to: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println("First Element is: "+arr[0]+" and Last ELement is: "+arr[arr.length-1]);

}
}



    

