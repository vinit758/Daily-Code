class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String arr[] = sentence.split(" ");
        int searchWordlength = searchWord.length();
        int i = 0;
        String text = "";
        String result = "";

        for (i = 0; i < arr.length; i++) {

            text = arr[i];
            if (text.length() >= searchWordlength) {
                result = text.substring(0, searchWordlength);

                if (result.equals(searchWord)) {
                    return i + 1;
                }

            }

        }
        return -1;

    }
}