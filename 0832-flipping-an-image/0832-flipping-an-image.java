class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            int st = 0, ed = image[i].length - 1;
            while(st < ed){
                int temp = image[i][st];
                image[i][st] = image[i][ed];
                image[i][ed] = temp;
                st++; ed--;
            }
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 1) image[i][j] = 0;
                else image[i][j] = 1;
            }
        }
        return image;
    }
}