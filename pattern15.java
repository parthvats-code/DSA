class Solution {
    public void pattern15(int n) {
       
        for(int i = n ; i >= 1 ; i--)
        {
           char ch = 'A';
            for(int j = 1 ; j<= i ; j++)
            {
                
                System.out.print(ch++);

            }
             System.out.println();
            }

    }
}