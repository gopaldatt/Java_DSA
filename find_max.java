import java.util.*;
public class find_max {
    public static  int find(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Maximum number in array is = "+ find(arr));
    }
}
