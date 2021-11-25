//Frequency of each element
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        int[] array=new int[10];
        //int n=input.nextInt();
        
        
        int i,j;
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
           
            if (array[i]==-100){
                continue;
            }
             int count=1;
            
           
            for(j=i+1;j<n;j++){
          if (array[i]==array[j]){
              
              
              array[j]=-100;
              count+=1;
             
             }
            }
           
            System.out.println(count);
             }
       
         
        input.close();
    }
}