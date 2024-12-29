class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int targetIndex = 0, result = 0;

        switch(ruleKey){
            case "color" -> targetIndex = 1;
            case "name" -> targetIndex = 2;
        }

        for(List<String> list : items){
            result += list.get(targetIndex).equals(ruleValue) ? 1 : 0 ;
        }

        return result;
    }
}