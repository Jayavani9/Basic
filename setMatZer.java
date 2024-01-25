73. Set Matrix Zeroes

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

class Solution {
    public void setZeroes(int[][] matrix) {
        //Tc: O(M*N) Sc: O(M+N)
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> zeroRows = new ArrayList<>();
        List<Integer> zeroCols = new ArrayList<>();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

  
        for (int row : zeroRows) {
            for (int j = 0; j < cols; j++) {
                matrix[row][j] = 0;
            }
        }

  
        for (int col : zeroCols) {
            for (int i = 0; i < rows; i++) {
                matrix[i][col] = 0;
            }
        }
    }
        
    }
