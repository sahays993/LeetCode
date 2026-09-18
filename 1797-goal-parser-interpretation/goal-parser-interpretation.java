class Solution {
    public String interpret(String command) {
        String x = command.replace("()","o");
        String y = x.replace("(al)","al");
        return y;
    }
}