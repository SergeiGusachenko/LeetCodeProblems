package 1662. Check If Two String Arrays are Equivalent;

public class 1662. Check If Two String Arrays are Equivalent {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1 = new String();
        String res2 = new String();
        for(int i = 0; i < word1.length; i++){
        res1 = res1.concat(word1[i]);
        }
        for(int i = 0; i < word2.length; i++){
            res2 = res2.concat(word2[i]);
        }
        return res2.equals(res1);
    }
}
