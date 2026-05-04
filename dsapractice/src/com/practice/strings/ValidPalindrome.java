package com.practice.strings;

public class ValidPalindrome {
	
	private boolean isPalindrome(String str)
	{
		if(str==null || str.length()==0)
			return true;
		
		int left=0;
		int right=str.length()-1;
		while(left!=right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left+=1;
			right-=1;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String str="yash";
		
		ValidPalindrome pd=new ValidPalindrome();
		System.out.println(pd.isPalindrome(str));
	}
}
