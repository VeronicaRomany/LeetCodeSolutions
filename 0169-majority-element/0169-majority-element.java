class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int maxFreq = (int) Math.floor(nums.length / 2);
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() > maxFreq) {
                return entry.getKey();
            }
        }

        return 0;
    }
}