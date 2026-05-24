class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet<>();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char num = board[i][j];

                if(num == '.')
                {
                    continue;
                }

                String rowKey = "row" + i + "-" + num;
                String colKey = "col" + j + "-" + num;

                int box = (i/3)*3 + (j/3);
                String boxKey = "box" + box + "-" + num;

                if(set.contains(rowKey)||set.contains(colKey)||set.contains(boxKey))
                {
                    return false;
                }
                set.add(rowKey);
                set.add(colKey);
                set.add(boxKey);
            } 
        }
        return true;
    }
}
