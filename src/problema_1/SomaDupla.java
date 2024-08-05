package problema_1;

public class SomaDupla {
    public int[] twoSum(int[] nums, int alvo) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == alvo) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
