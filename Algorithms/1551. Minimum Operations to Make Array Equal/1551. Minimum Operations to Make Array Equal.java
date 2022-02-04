package 1551. Minimum Operations to Make Array Equal;

public class 1551. Minimum Operations to Make Array Equal {

    public int minOperations(int n) {
        int [] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = (2*i) + 1;
            sum+= arr[i];
        }
        return sum/4;
    }
}
