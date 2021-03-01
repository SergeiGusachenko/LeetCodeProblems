package 22. Generate Parentheses;

public class 22. Generate Parentheses {
	public List generateParenthesis(int n) {
		List result = new ArrayList();
		findAll("(",1,0, result, n);
		return result;
		}
		void findAll(String curr, int open, int close,List result, int n)
		{

			if(curr.length()==2*n)
			{
				result.add(curr);
				return;
			}
			if(open<n)
			{
				findAll(curr+"(",open+1,close, result, n);

			}
			if(close<open)
			{
				findAll(curr+")",open,close+1, result, n);
			}
		}`
}
