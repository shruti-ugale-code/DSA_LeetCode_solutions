class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
         if(n==2) return 2;
         int a=0;
         int b=1;
         int c=2;

         for(int i=3;i<=n;i++){
            a=b+c;
            b=c;
            c=a;

         }
         return c;

        
    }
}
