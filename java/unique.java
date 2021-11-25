//Unique elements
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        int[] array=new int[10];
        //int n=input.nextInt();
        
        
        int i,j,count=0;
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
          if (array[i]==array[j]){
              break;
             
             }
            }
           if (j==n){
              count+=1;
             }
       }
         System.out.println(count+1);
        
        input.close();
    }
}