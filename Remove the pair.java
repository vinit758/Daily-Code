class Solution {
    public int minLength(String s) {
        char[] add = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            add[i] = s.charAt(i);
        }

        int index = 0; 
        for (int i = 0; i < add.length; i++) {
            if (index > 0 && ((add[index - 1] == 'A' && add[i] == 'B') || (add[index - 1] == 'C' && add[i] == 'D'))) {

                index--;
            } else {
               
                add[index] = add[i];
                index++;
            }
        }

        return index;
    }
}
