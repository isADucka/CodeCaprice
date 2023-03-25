import java.util.Arrays;

/**
 * @author isADuckA
 * @Date 2023/3/22 10:43
 * 长度最小的子数组
 */
public class MinArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        MinArray array = new MinArray();
        int i = array.minSubArrayLen(11, nums);
        System.out.println(i);
    }

    /**
     *  在一个区间里面一直寻找一个最小的相加数，如果这个数大于target，就继续缩小区间
     *  可以类比于一个滑动的窗口，当窗口中的相加总值大于目标数时，缩小这个窗口的长度
     */
    public int minSubArrayLen(int target, int[] nums) {
        int length=Integer.MAX_VALUE;
        int  start=0;
        int over=0;
        int targetNum=0;
        while(over<nums.length){
            targetNum+=nums[over++];
            while(targetNum>=target){
                length=Math.min(length,over-start);
                targetNum-=nums[start++];
            }
        }

        return length==Integer.MAX_VALUE?0:length;
    }
}