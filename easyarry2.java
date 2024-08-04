import java.util.*;

import javax.sound.midi.SysexMessage;

class easyarray2{
    int arr[];
    int n;

    easyarray2(int arr[],int n){
        this.arr=arr;
        this.n=n;
    }
    public void evenoccurence(int arr[],int n){
        int i=0;
        for(i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            if(count%2==0){
                System.out.println();
                System.out.println(arr[i]);
            }
           
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Size=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter The Elements=");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        easyarray2 obj=new easyarray2(arr,n);
        obj.evenoccurence(arr,n);
    }
}
