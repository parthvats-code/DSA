class Solution {
    public void pattern22(int n) {
        for(int i = 0; i < (n*2)-1  ; i++)
        {
            for(int j =0 ; j< (n*2)-1 ; j++  )
            {
                int top = i;
                int left = j;
                int bottom = 2*n-2-i;
                int right = 2*n-2-j;

                System.out.print(n-Math.min(Math.min(top,left),Math.min(bottom,right))+" ");
            }
            System.out.println();
        } 
    }
}