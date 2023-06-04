/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MazeSolver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Maze extends JFrame {

    public final int[][] grid = {
        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
        {2, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2},
        {2, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 2},
        {2, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 2},
        {2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 2},
        {2, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 2},
        {2, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 2},
        {2, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 2},
        {2, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 2},
        {2, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 2},
        {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 2},
        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},};

    //path
    public List<Integer> path = new ArrayList<>();
    
    //constructor
    public Maze() {

        setTitle("MAZE SOLVER");
        setSize(700, 720);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MazeSolver.ShowPath(grid, 1, 1, path);
         //System.out.print(path);   
        
    }

    @Override
    public void paint(Graphics g) {
        JOptionPane.showMessageDialog(null, "Welcome to Maze Runner! ");
        g.translate(100, 120);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                Color color = null;

                switch (grid[i][j]) {
                    case 0:
                        color = Color.white;
                        g.setColor(color);
                        g.fillRect(30 * j, 30 * i, 30, 30);
                        break;
                    case 2:
                        color = Color.black;
                        g.setColor(color);
                        g.fillRect(30 * j, 30 * i, 30, 30);
                        break;
                   
                    case 9:
                        color = Color.yellow;
                        g.setColor(color);
                        g.fillRect(30 * j, 30 * i, 30, 30);
                        break;
                    case 1:
                        color = Color.red;
                        g.setColor(color);
                        g.fillRect(30 * j, 30 * i, 30, 30);
                        break;

                }

                g.setColor(Color.orange);
                g.drawRect(30 * j, 30 * i, 30, 30);

            }
        }
        for (int i = 0; i < path.size(); i += 2) {
            int pathRow = path.get(i);
            int pathCol = path.get(i + 1);
            //System.out.print("x_corodiante"+pathRow+"y_corodiante"+pathCol);

            g.setColor(Color.green);
            g.fillRect(31 * pathCol, 31 * pathRow, 18, 19);
        }

    }
    

    public static void main(String[] args) {
        Maze mazeGrid = new Maze();
        mazeGrid.setVisible(true);
    }   
}

