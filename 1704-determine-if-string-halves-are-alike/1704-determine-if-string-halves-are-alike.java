class Solution {
    public boolean halvesAreAlike(String s) {
        // Convert the string to lowercase and to a character array
        char[] a = s.toLowerCase().toCharArray();
        
        int i, left = 0, right = 0;
        
        // Iterate through the string
        for (i = 0; i < a.length; i++) {
            // Check if the character is a vowel
            if (i < a.length / 2 && (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')) {
                left++;
            } else if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                right++;
            }
        }
        
        // Check if both halves are alike
        return left == right;
    }
}
