package com.practice.arrays;

import java.util.*;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {
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

        boolean result = isValidSudoku(board);
        System.out.println(result);
    }

    public static boolean isValidSudoku(char[][] board) {

        // Step 1: Create arrays of HashSet for rows, cols, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Step 2: Initialize all sets
        for(int i=0;i<rows.length;i++)
        {
        	rows[i]=new HashSet<Character>();
        	cols[i]=new HashSet<Character>();
        	boxes[i]=new HashSet<Character>();

        }

        for(int i=0;i<board.length;i++)
        {
        	for(int j=0;j<board.length;j++)
        	{
        		char num=board[i][j];
        		if(num=='.')
        			continue;
        		int boxIndex=(i/3)*3+(j/3);
        		
        		if(rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num))
        		{
        			
        			return false;
        		}
        		else
        		{
        			rows[i].add(num);
        			cols[j].add(num);
        			boxes[boxIndex].add(num);
        		}
        	}
        }
        // Step 3: Traverse the board (i, j)

            // Step 4: Skip if cell is '.'

            // Step 5: Calculate box index
            // int boxIndex = (i / 3) * 3 + (j / 3);

            // Step 6: Check if number already exists in:
            // rows[i], cols[j], boxes[boxIndex]

            // Step 7: If exists → return false

            // Step 8: Otherwise add number to corresponding sets

        // Step 9: If all checks pass → return true

        return true; // placeholder
    }
}