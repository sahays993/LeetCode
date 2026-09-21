class Solution {
    public String sortSentence(String s) {
        String[] strArr = s.trim().split(" ");
        String[] result = new String[strArr.length];
        for(String str: strArr){
            StringBuilder sb = new StringBuilder(str);
            int index = sb.charAt(sb.length()-1)-'0'-1;
            sb.deleteCharAt(sb.length()-1);
            result[index] = sb.toString();
        }
        return String.join(" ",result);
        
    }
}