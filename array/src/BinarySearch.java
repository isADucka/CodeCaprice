/**
 * @author isADuckA
 * @Date 2023/3/20 10:48
 * 二分查找
 *
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left=0;
        int rigth=nums.length;
        int mid;
        //这里需要注意一点的是这个范围，因为这里right是等于nums.length的,是没有实际意义的
        //进入循环，找到了直接return,找不到改变left或者是right
        while(left<rigth){
            mid=left+(rigth-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                rigth=mid;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
