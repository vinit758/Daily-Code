import java.io.*;
class ascending{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The Array Size=");
        int n=Integer.parseInt(br.readLine());

        int arr[]=new int[n];
        

        System.out.println("Enter The Elements=");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int k,j;

        

        for( j=0;j<n;j++){
            for(k=j+1;k<n;k++){
                if(arr[j]>arr[k]){
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    


                }
            }
        }
        System.out.println();
        for(int c=0;c<arr.length;c++){
            System.out.println(arr[c]);
        }
        
    }
}
      