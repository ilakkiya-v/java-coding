package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralarray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix[j].length;i++){
                list.add(matrix[0][j]);
            }
            list.add(matrix[j+1][matrix[j].length-1]);

        }
        System.out.println(list);
    }
}
