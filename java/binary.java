//Binary Search
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int a=input.nextInt();
        int[] array=new int[10];
        int i,low=0,high=a-1;
        for(i=0;i<a;i++){
            array[i]=input.nextInt();
            
        }
       
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==k){
                System.out.println(mid);
                break;
                
            }
            else if(array[mid]<k){
                low=mid+1;
                
                
            }
            else if(array[mid]>k){
                high=mid-1;
                
            }
            //mid=(low+high)/2;
           
          //System.out.println(mid);  
        }
        if (low>high){
            System.out.println("key not found");
        }
        
        
    }
}