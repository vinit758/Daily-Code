import java.io.*;
class avg{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The Array Size=");
        int n=Integer.parseInt(br.readLine());

        int arr[]=new int[n];

        System.out.println("Enter The Elements=");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        int sum=0;
        int count=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            count++;

        }
        int avg=sum/count;
        System.out.println("Average Of Array="+avg);
    }

}