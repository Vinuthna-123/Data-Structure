import java.util.*;
class Solution4 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int count1[] = new int[101];
        int count2[] = new int[101];
        for(int i=0;i<nums1.length;i++){
            count1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            count2[nums2[i]]++;
        }
        int res1=0,res2=0;
        for(int i=1;i<=100;i++){
            if(count2[i]>=1){
            res1+=count1[i];
            }
            if(count1[i]>=1){
                res2+=count2[i];
            }
        }
        ans[0]=res1;
        ans[1]=res2;
        return ans;
    }
    public static void main(String[] args) {
         Solution4 sol = new Solution4();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of arry1:");
        int n=in.nextInt();
        System.out.println("enter the size of arry2:");
        int m=in.nextInt();
         System.out.println("enter the array of numbers1");
         int nums1[] = new int[n];
         for(int i=0;i<n;i++){
            nums1[i]=in.nextInt();
         }
         System.out.println("enter the array of numbers2:");
         int nums2[] = new int[m];
         for(int i=0;i<m;i++){
            nums2[i]=in.nextInt();
         }
          
          int[] result = sol.findIntersectionValues(nums1,nums2);
          System.out.println("Intersection Values: [" + result[0] + ", " + result[1] + "]");
      in.close();
    }
}
