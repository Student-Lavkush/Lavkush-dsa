package game;
import java.util.Scanner;

public class Tictoe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char player = 'X';
        Boolean gameover = false;
        for(int rows =0;rows<board.length;rows++){
            for(int cols =0;cols<board[rows].length;cols++){
                board[rows][cols] =' ';
            }
        }
        Scanner input= new Scanner(System.in);
            while(!gameover){
                   printboard(board);
                   System.out.println("Player "+player+" Enter");
                   int row = input.nextInt();
                   int col = input.nextInt();
                   if(board[row][col]==' '){
                    board[row][col] = player;
                    gameover = havewon(board,player);
                    if(gameover){
                        System.out.println("Player "+player+" won");
                    }
                    else{
                        if(player=='X'){
                            player ='O';
                        }
                        else{
                            player = 'X';
                        }
                    }
                }
                    else{
                        System.out.println("invalid ");
                    }
                   
                   
            }
        
    }
    public static void printboard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println("");
        }
    }
    public static boolean havewon(char[][] board,char player ){
        for(int r =0;r<board.length;r++){
            if(board[r][0]==player&&board[r][1]==player&&board[r][2]==player){
                return true;
            }
        }
        for(int c= 0;c<board.length;c++){
            if(board[0][c]==player&&board[1][c]==player&&board[2][c]==player){
                return true;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
       else if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
        }
        return false;
    }
    

}