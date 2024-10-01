class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> singalString = new HashMap<String,Integer>();
        for (String word : s1.split(" ")) {
            singalString.put(word, singalString.getOrDefault(word, 0) + 1);
        }
        for (String word:s2.split(" ")) {
            singalString.put(word, singalString.getOrDefault(word, 0) + 1);
        }
        HashSet hs=new HashSet();
        for (Map.Entry<String,Integer> word : singalString.entrySet()) {
            if (word.getValue() == 1) {
                hs.add(word.getKey());
            }
        }
        String str[]=new String [hs.size()];
        hs.toArray(str);
        return str;
    }

}