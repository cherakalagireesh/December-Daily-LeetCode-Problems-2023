class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans  = new ArrayList<>();
        
        for(int i=1;i<=numRows;i++)
            ans.add(generateRows(i));
        
        return ans;
    }
    
    public List<Integer> generateRows(int row)
    {
        List<Integer> rowElements = new ArrayList<>();
        int element = 1;
        rowElements.add(element);
        
        for(int i=1;i<row;i++)
        {
            element = element * (row-i);
            element = element/i;
            rowElements.add(element);
        }
        
        return rowElements;
    }
}