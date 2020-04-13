public class TpsDemo {
    public int search(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        int mid ;
        while (left<=right) {
            mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
         return  -1 ;
    }

    public static   int mySqrt(int x) {
//        int squ = -1;
//        if (x==0) {
//            return  0;
//        }
//        int left = 1;
//        int right = x;
//        while (left <= right) {
//            int mid = left + (left+right)/2;
//            if (mid <= x / mid) {
//                left = mid + 1;
//                squ = mid;
//            } else {
//                right = mid -1 ;
//            }
//        }
//        return  squ;
        return (int)Math.sqrt(x);
    }

//    public int guessNumber(int n) {
//
//    }

    public static void main(String[] args) {
       // TpsDemo tpsDemo = new TpsDemo();
        //int[] nums = {-1,0,3,5,9,12};
       // int target =  9 ;
        //System.out.println(tpsDemo.search(nums, target));
        System.out.println(mySqrt(0));
    }


}
