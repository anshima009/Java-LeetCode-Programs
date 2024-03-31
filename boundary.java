public class boundary {
   
        public int returnToBoundaryCount(int[] nums) {
            int count=0;
            int bound=0;
            for(int n:nums){
                bound+=n;
                if(bound==0){
                    count++;
                }
            }
            return count;
        }
    
}
