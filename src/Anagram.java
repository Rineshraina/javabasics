import java.util.*;
public class Anagram{
	    static final int n = 26;
	    public static boolean isAnagrams(String s1,String s2,int k)
	    {
	        int num = s1.length();
	        if (s2.length() != num){
	            return false;
			}
	        int[] arr = new int[n];
	        for (int i = 0; i < num ; i++){
	            arr[s1.charAt(i)-'a']++;
			}
	        int count = 0;
	        for (int i = 0; i < num ; i++)
	        {
	            if (arr[s2.charAt(i)-'a'] > 0){
	                arr[s2.charAt(i)-'a']--;
				}
	            else{
	                count++;
				}
	            if (count > k){
	                return false;
				}
	        }
	        return true;
	    }
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	        String s1 = sc.next();
	        String s2 = sc.next();
	        int k = 2;
	        if (isAnagrams(s1, s2, k) == true){
	            System.out.println("true");
			}
	        else{
	            System.out.println("false");
			}
		}
	}
