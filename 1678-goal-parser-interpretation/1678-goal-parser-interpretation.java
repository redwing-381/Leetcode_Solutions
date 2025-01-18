class Solution {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < command.length()){
            if ('G' == command.charAt(i)){
                res.append("G");
                i += 1;
            }else if((command.substring(i,i+2)).equals("()")){
                res.append("o");
                i += 2;
            }else{
                res.append("al");
                i += 4;
            }
        }
        return res.toString();
    }
}