class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSub = 1<<n;
        List<List<Integer>> lst = new ArrayList<>();
        for(int num = 0;num<totalSub;num++){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;i< n;i++){
                if((num & (1<<i)) != 0){
                    temp.add(nums[i]);
                }
                
            }   
            lst.add(temp); 
        }
        return lst;
    }
}