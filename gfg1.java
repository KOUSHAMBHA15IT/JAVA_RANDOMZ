/*Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5*/
class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
         int i=0, j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(n==1)//one row
        {
            for(j=0;j<m;j+=1)
            {
                ans.add(matrix[i][j]);
            }
        }
        else if(m==1)//one column
        {
            for(i=0;i<n;i+=1)
            {
                ans.add(matrix[i][j]);
            }
        }
        else
        {
            i=0;
            j=0;
            
            //right
            for(j=0;j<m;j+=1)
            {
                ans.add(matrix[i][j]);
            }
            j=m-1;
            //bottom
            for(i=i+1;i<n;i+=1)
            {
                ans.add(matrix[i][j]);
            }
            i=n-1;
            //left
            for(j=m-2;j>=0;j-=1)
            {
                ans.add(matrix[i][j]);
            }
            j=0;
            for(i=n-2;i>0;i-=1)
            {
                ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}
