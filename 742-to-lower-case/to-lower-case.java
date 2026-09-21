class Solution {
    public String toLowerCase(String s) {
        char[] chArr = s.toCharArray();
        char[] result = new char[chArr.length];
        for(int i=0;i<chArr.length;i++){
            if(chArr[i]>=65 && chArr[i]<=90){
                result[i]=(char)(chArr[i]+32);
            }
            else{
                result[i]=chArr[i];
            }
        }
        return new String(result);
    }
}