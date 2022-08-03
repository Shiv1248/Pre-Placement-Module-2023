class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
        combinationSumI(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
    
    private void combinationSumI(int[] nums, int i, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (i == nums.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (nums[i] <= target) {
            ds.add(nums[i]);
            combinationSumI(nums, i, target - nums[i], ds, ans);
            ds.remove(ds.size() - 1);
        }
        combinationSumI(nums, i + 1, target, ds, ans);
    }

}