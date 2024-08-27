class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++){
            String str=details[i];

            String sub=str.substring(11,13);
            int age=Integer.parseInt(sub);

            if(age > 60){
                count++;
            }
    
        }
        return count;
    }
}