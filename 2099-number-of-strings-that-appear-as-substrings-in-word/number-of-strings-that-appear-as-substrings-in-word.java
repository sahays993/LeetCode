class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String currentWord: patterns){
            if(word.contains(currentWord)) count++;
        }
        return count;
    }
}