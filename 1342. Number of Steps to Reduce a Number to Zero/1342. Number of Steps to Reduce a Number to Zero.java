package 1342. Number of Steps to Reduce a Number to Zero;

public class 1342. Number of Steps to Reduce a Number to Zero {
	public static int numberOfSteps (int num) {
        result++;
        if(num == 0)
            return 0;
        if(num % 2 == 0)
            numberOfSteps(num/2);
        else
            numberOfSteps(num - 1);
        return result;
    }
}
