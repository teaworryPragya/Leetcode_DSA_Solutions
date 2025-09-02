class Solution {
    public int fib(int n) 
    {
        int a=0,b=1;
        if(n==0) return a;
        if(n==1) return b;

        for(int i=2;i<=n;i++)
        {
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
        // if(n==0) return 0;
        // if(n==1) return 1;
        // int next = fib(n-1) + fib(n-2);
        // return next;
    }
}