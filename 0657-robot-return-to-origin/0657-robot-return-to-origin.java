class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0, horizontal = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i); 
            if (ch == 'U') {
                vertical++; // Moving up increases the vertical count
            } else if (ch == 'D') {
                vertical--; // Moving down decreases the vertical count
            } else if (ch == 'R') {
                horizontal++; // Moving right increases the horizontal count
            } else if (ch == 'L') {
                horizontal--; // Moving left decreases the horizontal count
            }
        }
        // The robot returns to the origin if both vertical and horizontal counters are zero
        return vertical == 0 && horizontal == 0;
    }
}
