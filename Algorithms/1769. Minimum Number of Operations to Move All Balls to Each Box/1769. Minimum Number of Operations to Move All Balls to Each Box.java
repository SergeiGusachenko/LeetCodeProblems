package 1769. Minimum Number of Operations to Move All Balls to Each Box;

public class 1769. Minimum Number of Operations to Move All Balls to Each Box {
	public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        int before = 0;
        int after = 0;
        for (int i = 1; i < boxes.length(); i++) {
            if(boxes.charAt(i) == '1') {
                res[0] += i;
                after++;
            }
        }


        for (int i = 1; i < boxes.length(); i++) {
            if (boxes.charAt(i-1) == '1') {
                before++;
            }
            //System.out.println(res[i-1] + " - " + after + " + " + before);
            res[i] = res[i-1] + before - after;
            if(boxes.charAt(i) == '1') {
                after--;
            }
        }


        return res;
    }
}
