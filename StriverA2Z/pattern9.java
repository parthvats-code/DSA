
class Solution {
    public void pattern9(int n) {
        
        for (int i = 1 ; i <=n ; i++ )
        {
            for(int k = (n-i);k>0;k--)
            {
                System.out.print(" ");
            }
            for( int j = 0 ; j<(i*2) -1 ; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }


    
        for (int i = n ; i >= 1 ; i-- )
        {
            for(int k = (n-i);k>0;k--)
            {
                System.out.print(" ");
            }
            for( int j = 0 ; j<(i*2) -1 ; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }


    }
}
