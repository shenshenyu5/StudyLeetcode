/**
 * @author George
 * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
 *
 * ����һ������ -- head = [4,5,1,9]�������Ա�ʾΪ:
 *
 *
 *
 *
 *
 * ʾ�� 1:
 *
 * ����: head = [4,5,1,9], node = 5
 * ���: [4,1,9]
 * ����: ������������ֵΪ 5 �ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 1 -> 9.
 * ʾ�� 2:
 *
 * ����: head = [4,5,1,9], node = 1
 * ���: [4,5,9]
 * ����: ������������ֵΪ 1 �ĵ������ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 5 -> 9.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}