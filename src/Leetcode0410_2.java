import java.util.Arrays;

/**
 * @author George
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * 示例 1:
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * 示例 2:
 *
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */
public class Leetcode0410_2 {
    /**
     * 自己写的代码7ms，击败了71.94%的用户
     * 内存消耗37.6mb，击败了0.93的用户
     * 相对而言，执行速度还阔以，内存消耗较大比较垃圾
     * @param A
     * @return
     */
    public static  int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j]==1) {
                    A[i][j] -= 1;
                    continue;
                }
                if (A[i][j]==0) {
                    A[i][j] += 1;

                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length/2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length-j-1];
                A[i][A[i].length-j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
            return  A;
    }

        public static void main(String[] args) {
        //[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
            int[][] arr = new int[4][4];
            arr = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
            System.out.println(flipAndInvertImage(arr));
        }
}
