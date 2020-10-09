class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> arr = new ArrayList<Integer>();

        
         if (nums == null || nums.length == 0)
            return new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
              int nn = Math.abs(nums[i])-1;

            if(nums[nn]>0){
                nums[nn] = -(nums[nn]);
            }
        }

        for(int i=0;i<nums.length;i++){
             
            if(nums[i]>0){
                arr.add(nums[i+1]);
            }
        }
        return arr;

    }
}