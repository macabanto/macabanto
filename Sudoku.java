import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

/**
 * Sudoku PP Divide and Conquer
 * 
 * @author Antonio Macabantad
 */
public class Sudoku{
    public static int[] checkHorizontal(int[] possibleValues) {
        return possibleValues;
    }

    public static int[] checkVertical(int[] possibleValues) {
        return possibleValues;
    }

    public static int[] checkBox(int[] possibleValues) {
        return possibleValues;
    }

    public static int[][][] makeNotedGrid(int WIDTH, int HEIGHT, int POSSIBLEVALS){
        int[][][]notedGrid = new int[WIDTH][HEIGHT][POSSIBLEVALS];

        for(int i=0;i<WIDTH;i++){
            for(int j=0;j<HEIGHT;j++){
                notedGrid[i][j]=new int[]{1,2,3,4,5,6,7,8,9};
                //System.out.println(Arrays.toString(notedGrid[i][j]));
            }
        }
        return notedGrid;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int WIDTH = 9;
        final int HEIGHT = 9;
        final int POSSIBLEVALS = 9;
        int cellInt;
        System.out.println("Please input puzzle seaparating cells by commas and rows by semicolons");
        int[][] grid = {
               {7,3,8,5,1,0,9,6,2},
               {0,4,9,3,0,7,0,0,5},
               {0,5,1,0,2,0,0,0,0},
               {3,0,2,7,0,0,0,0,0},
               {0,0,6,4,0,2,7,5,3},
               {4,0,0,6,0,0,2,1,0},
               {0,0,0,2,0,0,0,3,0},
               {0,0,0,0,3,0,6,4,0},
               {0,0,3,9,0,5,0,2,0}
               };
        for(int i=0;i<9;i++){
            System.out.println(Arrays.toString(grid[i]));
        }       
        makeNotedGrid(WIDTH, HEIGHT, POSSIBLEVALS);
        


    }
}
