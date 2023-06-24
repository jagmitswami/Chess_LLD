package com.chess.game;

import java.util.Scanner;

import com.chess.game.enums.Color;
import com.chess.game.enums.GameStaus;
import com.chess.game.piece.Piece;

public class Game {

	private final Board board;
	private static GameStaus staus;
	private Color turn;
	private Scanner scanner;

	public Game() {
		board = new Board();
		staus = GameStaus.ACTIVE;
		turn = Color.WHITE;
		scanner = new Scanner(System.in);
	}

	public GameStaus play() {
		if (staus != GameStaus.ACTIVE) {
			return staus;
		}

		System.out.println("Turn : " + turn);
		BoardPrinter.printBoard(board);
		System.out.println("Enter move (current_row current_col move_row move_col) : ");
		String[] positions = scanner.nextLine().trim().split(" ");
		int current_row = Integer.parseInt(positions[0]);
		int current_col = Integer.parseInt(positions[0]);
		int move_row = Integer.parseInt(positions[0]);
		int move_col = Integer.parseInt(positions[0]);

		if (current_row < 0 || current_col < 0 || current_row > 7 || current_col > 7 || move_row < 0 || move_col < 0
				|| move_row > 7 || move_col > 7) {
			System.out.println("Invalid position selected!");
			return play();
		}

		Cell[][] cells = board.getCells();
		Cell currentCell = cells[current_row][current_col];
		Cell moveCell = cells[move_row][move_col];

		if (!verifyMove(currentCell, moveCell)) {
			System.out.println("Invalid move!");
			return play();
		}

		

		return play();
	}

	public boolean verifyMove(Cell currentCell, Cell moveCell) {
		Piece currentCellPiece = currentCell.getPiece();
		Color currentCellPieceColor = currentCellPiece.getColor();
		Piece moveCellPiece = currentCell.getPiece();
		Color moveCellPieceColor = moveCellPiece.getColor();
		if (currentCellPieceColor != turn || moveCellPieceColor == turn) {
			return false;
		}
		return true;
	}

}
