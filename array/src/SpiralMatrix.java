import java.util.Arrays;

/**
 * @author isADuckA
 * @Date 2023/3/26 11:01
 * 螺旋矩阵
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.generateMatrix(3);
    }
    public int[][] generateMatrix(int n) {
            int[][] arr = new int[n][n];
            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = n - 1;
            int num = 1;

            while (num <= (n * n)) {
                //从左到右
                for (int i = left; i <= right; i++) {
                    arr[top][i] = num++;
                }
                top++;
                //从上到下
                for (int i = top; i <= bottom; i++) {
                    arr[i][right] = num++;
                }
                right--;
                //从右到左
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
                //从下到上
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
            return arr;

    }
}
