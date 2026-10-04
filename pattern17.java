class Solution {
    public void pattern17(int n) {
       int j = 0 ;
        for(int i = 1; i <= n ; i++)
        {
            for( j = 1 ; j<= n-i ; j++)
            {
                System.out.print(" ");
            }
            char ch = 'A'; 
           
            for( j = 1 ; j<= i ; j++)
            {
                 
                System.out.print(ch);
               ch++;
                

            }ch--;
            for( j = 1 ; j<i ; j++)
            {
                ch--;
                System.out.print(ch);
               

            }
             System.out.println();
             
            }

    }
}