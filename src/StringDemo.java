public class StringDemo {
//    public String addBinary(String a, String b) {
//        char[] chars1 = a.toCharArray();
//        char[] chars2 = b.toCharArray();
//        int chars1Length = chars1.length;
//        int chars2Length = chars2.length;
//
//    }

    /**
     * 返回最长前缀  实现思路：先把第一个和第二个数组元素做比较 取到相同的前缀，再用此前缀判断其余数组元素是否包含
     * @param strs 字符串数组
     * @return 返回最长前缀的字符串
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String str = strs[0];
        for(int i = 1; i < strs.length; i++){
            System.out.println(strs[i].indexOf(str));
            while(strs[i].indexOf(str) != 0){
                str=str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public static int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return  0 ;
        }
        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                while (chars1[i]==chars2[j]&&chars1[i+1]==chars2[j+1]) {
                    return i;
                }
            }
        }
            return  -1 ;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","fly"};
       // System.out.println(longestCommonPrefix(strs));
        System.out.println(strStr("aaaaa", "bba"));
    }

}
