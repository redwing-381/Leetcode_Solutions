class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2){
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++){
                int firstDigit = s.charAt(i) - '0';               
                int secondDigit = s.charAt(i + 1) - '0';        
                int newDigit = (firstDigit + secondDigit) % 10;  
                newString.append(newDigit);      
            }
            s = newString.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}