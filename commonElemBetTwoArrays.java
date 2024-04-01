import java.util.HashSet;
import java.util.Set;

public class commonElemBetTwoArrays {
    
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1=0;
        int count2=0;
        int ans[]=new int[2];
        int n=nums1.length;
        int m=nums2.length;
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        for(int i=0;i<n;i++){
           if(set2.contains(nums1[i])){
              count1++;
           }
        }

        for(int i=0;i<m;i++){
           if(set1.contains(nums2[i])){
              count2++;
           }
        }
        ans[0]=count1;
        ans[1]=count2;
        return ans;
    }

}
