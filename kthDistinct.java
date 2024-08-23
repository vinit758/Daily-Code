class kthDistinct  {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        HashMap <String,Integer> cnt =new HashMap<>();

        for(String s : arr){
            cnt.put(s,cnt.getOrDefault(s,0)+1);
        }
        int discount=0;
        for(String s : arr){
            if(cnt.get(s)==1){
                discount++;
            }
            if(discount==k){
                return s;
            }
        }
        return "";  
    }
}