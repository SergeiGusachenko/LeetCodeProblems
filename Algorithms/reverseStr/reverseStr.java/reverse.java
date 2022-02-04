package reverseStr.reverseStr.java;

public class reverse {
	public static String reverseStr(String s, int k) {
        char [] array = s.toCharArray();
        for(int start = 0; start < array.length; start += 2*k){
            int i = start;
            int j = Math.min(start + k - 1, array.length - 1);
            while(i < j){
                char tmp = array[i];
                array[i++] = array[j];
                array[j--] = tmp;
            }
        }
        return new String(array);
    }
}
