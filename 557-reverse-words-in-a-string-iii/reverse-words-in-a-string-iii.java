class Solution {
    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        String[] result = new String[arr.length];
        int i=0;
        for(String word: arr){
            StringBuilder sb = new StringBuilder(word);
            result[i]=sb.reverse().toString();
            i++;
        }
        return String.join(" ",result);
    }
}