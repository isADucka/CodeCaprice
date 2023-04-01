import java.util.HashSet;
import java.util.Set;

/**
 * @author isADuckA
 * @Date 2023/4/1 12:46
 * 两数组的交集
 */
public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set set=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        //如果set里面包含了，就把这个值添加到result里面去
        Set result=new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int[] over=new int[result.size()];
        int i=0;
        //set转化为int[]
        for(Object num:result){
            over[i++]=(int)num;
        }
        return over;
    }
}
