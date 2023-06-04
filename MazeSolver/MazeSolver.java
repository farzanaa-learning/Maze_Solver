/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MazeSolver;

import java.util.List;


public class MazeSolver {

    
    public static boolean ShowPath(int[][] grid, int row, int col, List <Integer> path){
        if(grid[row][col]==9){
            path.add(row);
            path.add(col);
            return true;
        }
        if (grid[row][col] == 0) {
            grid[row][col] = 3;
            
            //down
            int dr = 1;
            int dc = 0;
            if (ShowPath(grid, row + dr, col + dc, path)) {
                path.add(row);
                path.add(col);
                return true;
            }
            
            //left
             dr = 0;
            dc = -1;
            if (ShowPath(grid, row + dr, col + dc, path)==true) {
                path.add(row);
                path.add(col);
                return true;
            }
            
            //right
            dr = 0;
            dc = 1;
            if (ShowPath(grid, row + dr, col + dc, path)==true) {
                path.add(row);
                path.add(col);
                return true;
            }
            
            //up
             dr = -1;
             dc = 0;
            if (ShowPath(grid, row + dr, col + dc, path)==true) {
                path.add(row);
                path.add(col);
                return true;
            }
            
            
            
        }
        return false;
    }
}
