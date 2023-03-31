/**
 * @author isADuckA
 * @Date 2023/3/31 11:07
 * 有效的字母异位词
 */
public class EffectLetter {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //利用数组存贮，
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        //当减到少于0的时候就意味着两个已经有区别了，所以直接返回false
        for(int i=0;i<s.length();i++){
            arr[t.charAt(i)-'a']--;
            if((arr[t.charAt(i)-'a'])<0){
                return false;
            }
        }
        return true;
    }
}
