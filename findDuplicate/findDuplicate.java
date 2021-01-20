package findDuplicate;

public class findDuplicate {
	public static int findDuplicate(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        boolean first_time_here_sorry_for_such_a_stupid_variable = true;
        while(first != second || first_time_here_sorry_for_such_a_stupid_variable){
            first = nums[first];
            second = nums[nums[second]];
            first_time_here_sorry_for_such_a_stupid_variable = false;
        }
        first = nums[0];
        while(first != second){
            first = nums[first];
            second = nums[second];
        }
        return second;
    }
}
