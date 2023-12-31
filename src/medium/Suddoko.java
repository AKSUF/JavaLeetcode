package medium;

import java.util.HashSet;
import java.util.Set;

public class Suddoko {
    public static void main(String[] args) {
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}

        };
        boolean result=isValidSuddoko(board);
        System.out.println(result);
    }

    private static boolean isValidSuddoko(char[][] board) {
        Set<String>seen=new HashSet<>();
for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
        char num=board[i][j];
        if(num!='.'){
            String rowkey="row-"+i+"-"+num;
            String colKey="col-"+j+"-"+num;
            String boxkey="box-"+(i/3)+"-"+(j/3)+"-"+num;
            if(seen.contains(rowkey)||seen.contains(colKey)||seen.contains(boxkey)){
                return false;
            }
            seen.add(rowkey);
            seen.add(colKey);
            seen.add(boxkey);
        }
    }
}

        return true;
    }
}
