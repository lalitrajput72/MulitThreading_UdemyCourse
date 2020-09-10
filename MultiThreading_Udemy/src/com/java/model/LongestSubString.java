package com.java.model;

public class LongestSubString
{
 public static String nonRepeativeSubstr(String str,int n)
 {
  int dp[][]=new int[n+1][n+1];
  int max=0,index=0;
  for(int i=1;i<=n;++i)
  {
   for(int j=i+1;j<=n;++j)
   {
    if(str.charAt(i-1)==str.charAt(j-1) && j-i>dp[i-1][j-1])
    {dp[i][j]=dp[i-1][j-1]+1;
    if(max<dp[i][j])
        {
          max=dp[i][j];
//save last index of substring
          index=Math.max(i,index);
        }
    }
    else
     dp[i][j]=0;
   }
  }
  return max>0?str.substring(index-max,index):"-1";
 }
public static void main (String[] args)
 {
	String s="affedaaffed";
System.out.println(nonRepeativeSubstr(s, s.length()));
}
}