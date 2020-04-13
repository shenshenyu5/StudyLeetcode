import java.util.Arrays;

/**
 * @author George
 * ����һ�������ƾ��� A����������ˮƽ��תͼ��Ȼ��תͼ�񲢷��ؽ����
 *
 * ˮƽ��תͼƬ���ǽ�ͼƬ��ÿһ�ж����з�ת�����������磬ˮƽ��ת [1, 1, 0] �Ľ���� [0, 1, 1]��
 * ��תͼƬ����˼��ͼƬ�е� 0 ȫ���� 1 �滻�� 1 ȫ���� 0 �滻�����磬��ת [0, 1, 1] �Ľ���� [1, 0, 0]��
 *
 * ʾ�� 1:
 * ����: [[1,1,0],[1,0,1],[0,0,0]]
 * ���: [[1,0,0],[0,1,0],[1,1,1]]
 * ����: ���ȷ�תÿһ��: [[0,1,1],[1,0,1],[0,0,0]]��
 *      Ȼ��תͼƬ: [[1,0,0],[0,1,0],[1,1,1]]
 * ʾ�� 2:
 *
 * ����: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * ���: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * ����: ���ȷ�תÿһ��: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]��
 *      Ȼ��תͼƬ: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */
public class Leetcode0410_2 {
    /**
     * �Լ�д�Ĵ���7ms��������71.94%���û�
     * �ڴ�����37.6mb��������0.93���û�
     * ��Զ��ԣ�ִ���ٶȻ����ԣ��ڴ����Ľϴ�Ƚ�����
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