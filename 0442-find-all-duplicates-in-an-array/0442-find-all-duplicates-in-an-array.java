class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i += 1;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++){
            if (arr[i] != i + 1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}