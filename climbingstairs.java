public class climbingstairs {
    public static int climbStairs(int n){
        if (n==0 || n==1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static void main(String[] args) {
        int n=44;
        int result=climbStairs(n);
        System.out.println(result);

        
    }
}


// because of time limit exceeding error we use another approach
class Solution {
public
    int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
};
