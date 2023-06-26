package com.chess.game;

import java.util.Scanner;

import com.chess.game.enums.Color;
import com.chess.game.enums.GameStaus;
import com.chess.game.piece.Piece;

public class Game {

	private static Board board;
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
		System.out.println("Enter move (current_row current_col next_row next_col) : ");
		String[] positions = scanner.nextLine().trim().split(" ");
		int current_row = Integer.parseInt(positions[0]);
		int current_col = Integer.parseInt(positions[0]);
		int next_row = Integer.parseInt(positions[0]);
		int next_col = Integer.parseInt(positions[0]);

		if (current_row < 0 || current_col < 0 || current_row > 7 || current_col > 7 || next_row < 0 || next_col < 0
				|| next_row > 7 || next_col > 7) {
			System.out.println("Invalid position selected!");
			return play();
		}

		Cell[][] cells = board.getCells();
		Cell currentCell = cells[current_row][current_col];
		Cell moveCell = cells[next_row][next_col];

		if (!verifyMove(currentCell, moveCell)) {
			System.out.println("Invalid move!");
			return play();
		}

		Piece piece = currentCell.getPiece();
		piece.move(new int[] { current_row, current_col }, new int[] { next_row, next_col });

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
