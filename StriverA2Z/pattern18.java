class Solution {
    public void pattern18(int n) {
        int i = 0 ; 
        char ch = 'A';
        for(i = 1 ; i< n ; i++ )
        {
            ch++;
             
        }
        char t = ch;
        for(i = 1 ; i <= n ; i++)
        {
            ch = t ;
            for(int j= 1 ; j<i ; j++)
        {
            ch--;
        }  
           
        while(ch <= t)
        {
            System.out.print(ch+" ");
            ch++;
        }
         System.out.println();
        }

    }
}