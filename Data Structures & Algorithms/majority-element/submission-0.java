class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int threshold = n/2;
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0) + 1);

            if(map.get(num)>threshold)
            {
                return num;
            }
        }
        return -1;

        

    }
}