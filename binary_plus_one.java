public class binary_plus_one {
   
        public String addBinary(String a, String b) {
            int ad=Integer.parseInt(a,2);
            int bd=Integer.parseInt(b,2);
            int sum=ad+bd;
            String result=Integer.toBinaryString(sum);
            return result;
        }
    
}




class Solution {
    public String addBinary(String a, String b) {
        

        int alen=a.length();
        int blen=b.length();
        int i=0, carry=0;
        String ans="";
        
        while (i<alen || i<blen || carry!=0){
            int x=0;
            if (i<alen && a.charAt(alen-i-1)=='1'){
                x=1;
            }
            
            int y=0;
            if(i<blen && b.charAt(blen-i-1)=='1'){
                y=1;
            }
            ans=Integer.toString((x+y+carry)%2) + ans;
            carry=(x+y+carry)/2;
            i+=1;
        }
        return ans;
            
    }
}