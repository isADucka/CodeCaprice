/**
 * @author isADuckA
 * @Date 2023/3/21 9:37
 */
public class Remove {
    //测试
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,3,4,2};
        Remove remove = new Remove();
        remove.removeElement(nums, 2);
    }

    public int removeElement(int[] nums, int val) {
        if(nums.length==1){
            if(nums[0]==val){
                return 0;
            }else{
                return 1;
            }
        }
//一个快指针一个慢指针，通过判断快指针是否等于val来赋值给慢指针
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]==val){
                fast++;
            }else{
                nums[slow]=nums[fast];
                slow++;
                fast++;
            }
        }
        return slow;
    }
}
