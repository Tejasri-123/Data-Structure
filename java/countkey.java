//counting the key
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int key=input.nextInt();
        int n=input.nextInt();
        int[] array=new int[10];
        
        
        int i,count=0;
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
          if (array[i]==key){
             count++;
         
        }
        }
        System.out.println(count);
            
        
        input.close();
    }
}