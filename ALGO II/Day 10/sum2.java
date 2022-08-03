class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combinationSum2Helper(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
	
	
private void combinationSum2Helper(int[] candidates, int start, int target, List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skipping duplicate numbers.
            if (i > start && candidates[i - 1] == candidates[i]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            tempList.add(candidates[i]);
            combinationSum2Helper(candidates, i + 1, target - candidates[i], tempList, result);
            tempList.remove(tempList.size() - 1);
        }
    }
}