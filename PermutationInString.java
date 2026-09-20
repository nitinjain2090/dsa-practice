class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
    return false;
}
        int s1Window[]=new int [26];
        int s2Window[]=new int [26];
        
        for(int i=0;i<s1.length();i++)
        {
            s1Window[s1.charAt(i)-'a']++;
            s2Window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1Window,s2Window))
        {
            return true;      }
        for(int i=s1.length();i<s2.length();i++)
        {
            s2Window[s2.charAt(i)-'a']++;
            s2Window[s2.charAt(i-s1.length())-'a']--;
           if(Arrays.equals(s1Window,s2Window))
        {
            return true;
        }  
        }
        return false;
    }
}