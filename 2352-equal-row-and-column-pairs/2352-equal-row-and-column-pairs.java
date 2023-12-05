class Solution {
    public int equalPairs(int[][] grid) {
        
        int result = 0;
        int size = grid.length;
        Map<String,Integer> rows = new HashMap<>();
        Map<String,Integer> cols = new HashMap<>();

        for(int i=0;i<size;i++)
        {
            StringBuilder rowStr = new StringBuilder();
            StringBuilder colStr = new StringBuilder();

            for(int j=0;j<size;j++)
            {
                rowStr.append(grid[i][j]).append(",");
                colStr.append(grid[j][i]).append(",");
            }

            rows.put(rowStr.toString(),rows.getOrDefault(rowStr.toString(),0)+1);
            cols.put(colStr.toString(),cols.getOrDefault(colStr.toString(),0)+1);
        }

        for(String key:rows.keySet())
        {
            if(cols.containsKey(key))
            {
                result = result + rows.get(key) * cols.get(key);
            }
        }

        return result;
    }
}