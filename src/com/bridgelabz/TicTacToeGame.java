package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

    static Scanner scanner = new Scanner(System.in);
    static char [] board = new char[10];
    static char playerChoice;
    static char computerChoice;

    /* Initializing an array of size 10
       In array we have to create an empty space for array[index] from 1 to 9.
     */
    public static void createBoard(){
        for (int index=1; index<board.length; index++){
            board[index] = ' ';
        }
    }

    /* In this player have to choose the character value between 'X' or 'O'.
       We have to allow the player to choose between X or O.
     */
    static void choose(){
        System.out.print("Enter your Choice : ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X' || choice == 'x'){
            playerChoice = 'X';
            computerChoice = 'O';
            System.out.println("Player Choice : " + playerChoice);
            System.out.println("Computer Choice : " + computerChoice);
        }else if (choice == 'O' || choice == 'o'){
            playerChoice = 'O';
            computerChoice = 'X';
            System.out.println("Player Choice : " + playerChoice);
            System.out.println("Computer Choice : " + computerChoice);
        }
        else {
            System.out.println("Invalid Choice! Enter a valid choice between X or O");
        }
    }

    /* In this method we have to show case the Board.
     */
    static void showBoard(){
        System.out.println(); // Used for an empty line.
        System.out.println("Tic Tac Toe Board");
        System.out.println(board[1] + "   |   " + board[2] + "   |   " + board[3]);
        System.out.println("-----------------");
        System.out.println(board[4] + "   |   " + board[5] + "   |   " + board[6]);
        System.out.println("-----------------");
        System.out.println(board[7] + "   |   " + board[8] + "   |   " + board[9]);
    }

    /* Ability for user to make a move to a desired location in the board
     */
    public static void playerMove(){
        System.out.print("Select Position in Index to Move in Board (1 to 9) : ");
        int indexNumber = scanner.nextInt();
        if (indexNumber < 1 && indexNumber > 9){
            System.out.println("You Entered Invalid Position ");
            playerMove();

            /* In this we are checking for empty space.
             */
        }else if(board[indexNumber] != ' ') {
            System.out.println("The Index is already occupied kindly choose other index ");
            playerMove();
        }
        else {
            board[indexNumber] = playerChoice;
            showBoard();
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        choose();
        showBoard();
        playerMove();
    }
}