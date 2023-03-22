/**
 * @author isADuckA
 * @Date 2023/3/22 10:16
 * 有序数组的平方
 */
public class Square {
    public int[] sortedSquares(int[] nums) {
        int length=nums.length;
        int[] doubleNum=new int[length];
        int left=0;
        int right=length-1;
        int dright=length-1;

        /***
         *  开两个指针，一个最开始指向右边，一个指向左边，
         *  比较两个的平方大小，最大的那个填到新数组的组后面
         */
        while(dright>-1){
            if((nums[left]*nums[left])>(nums[right]*nums[right])){
                doubleNum[dright]=(nums[left]*nums[left]);

                left++;
            }else {
                doubleNum[dright]=(nums[right]*nums[right]);
                right--;
            }
            dright--;
        }
        return doubleNum;
    }
}
