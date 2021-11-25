//Linear search
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int key=input.nextInt();
        int n=input.nextInt();
        int[] array=new int[10];
        //int n=input.nextInt();
        
        
        int i,flag=0;
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
          if (array[i]==key){
              flag=1;
         
        }
        }
        if(flag==1){
             System.out.println("key is found at "+i);
        }
        
        else{
            System.out.println("key not is found");
            
        }
        input.close();
    }
}