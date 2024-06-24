

import java.io.*;
class P1{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Size=");
		int size=Integer.parseInt(br.readLine());
		int num=0;
		for(int i=1;i<size*2;i++){
			if(i<=size){
				num++;
			}
			else{
				num--;
			}
			for(int j=1;j<=num;j++){
				System.out.print("#"+"\t");
			}
			System.out.println();
		}
	}
}
				
