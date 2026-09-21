class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toCharArray();
        int start=0;
        int end=arr.length-1;
        int count1=0;
        int count2=0;
        while(end>start){
            if(isVovel(arr[start])){
                count1++;
            }
            if(isVovel(arr[end])){
                count2++;
            }
            start++;
            end--;
        }
        if(count1==count2) return true;
        return false;
    }
    public static boolean isVovel(char value){
        value = Character.toLowerCase(value);
        if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u') return true;
        return false;
    }
}