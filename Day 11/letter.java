import java.util.*;
class letter{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String=");
        String v=sc.next();

        System.out.println("Enter The Letter=");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<v.length();i++){
            if(v.charAt(i)==ch){
                count++;
            }
            
        }
        System.out.println("Count Of String="+count);
        

    }
}