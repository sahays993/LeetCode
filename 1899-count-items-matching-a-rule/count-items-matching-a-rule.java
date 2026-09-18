class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int total=0;
        int index = 0;
        if(ruleKey.equals("color")){
            index = 1;
        }
        else if(ruleKey.equals("name")){
            index=2;
        }
        for(int i=0;i<items.size();i++){
            List<String> item = items.get(i);//fetches the whole row in a variable 
            if(item.get(index).equals(ruleValue)){
                total+=1;
            }
        }
        return total;
    }
}