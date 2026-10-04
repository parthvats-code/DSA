class Solution {
    public void pattern11(int n) {
        for(int i = 1 ; i <=n ; i++)
        {
             if(i%2==0){
                for(int j = 0 ; j< i; j++)
            {
                System.out.print(j%2+" ");  
            }
             }
             else{
                for(int j = 1 ; j<= i; j++)
            {
                System.out.print(j%2+" ");  
            }
            }
               System.out.println();
             
            
                
        }

    }
}