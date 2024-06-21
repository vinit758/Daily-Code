// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size =");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
         System.out.println("Enter The Elements =");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
            
            
            
        }
        System.out.println();
        for(int k=0;k<n;k++){
             System.out.println(arr[k]);
        }
            
        }
       
        
    }
