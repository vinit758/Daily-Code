class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count=0;
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            String ageStr = details[i].substring(details[i].length() - 4, details[i].length() - 2);
            int age = Integer.parseInt(ageStr);
            arr[i]=age;

            if(arr[i] >= 60){
                count++;
            }
            
        }
       
return count;
        
    }
}
