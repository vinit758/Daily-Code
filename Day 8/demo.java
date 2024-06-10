import java.io.*;
class demo{
    public static void main(String vinit[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Array Size=");
        int n=Integer.parseInt(br.readLine());

        int arr[]=new int[n];

        System.out.println("Enter The Elements=");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int sum=0;

        for(int j=0;j<n;j++){
            sum+=arr[j];
        }
        System.out.println("Array Of Sum="+sum);
    }

}