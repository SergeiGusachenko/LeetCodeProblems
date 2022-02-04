//easy leetcode question, task number 13
class Solution {
	public int romanToInt(String s) {
	   int ans =0;
			for(int i =0;i<s.length();){
				if(i == s.length() - 1)
					return ans + get_value(s.charAt(i));
				int val_curr_char = get_value(s.charAt(i));
				int val_next_char = get_value(s.charAt(i+1));
				if(val_curr_char<val_next_char){
					ans = ans + (val_next_char-val_curr_char);
					i+=2;
				}else{
					ans = ans + val_curr_char;
					i++;
				}
			}
			return ans;
		}
		private int get_value(char symbol){
			if(symbol=='I') return 1;
			else if(symbol=='V') return 5;
			else if(symbol=='X') return 10;
			else if(symbol=='L') return 50;
			else if(symbol=='C') return 100;
			else if(symbol=='D') return 500;
			return 1000;
		}
	}