package com.chess.game;

import com.chess.game.enums.Color;

public class Game {

	private final Board board;
	

	public void startGame() {
		BoardPrinter.printBoard(board);
	}


	{

		Cell[][] cells = new Cell[8][8];

		// Adding pawns
		boolean isWhite = true;
		for (int col = 0; col < 8; col++) {
			if (isWhite) {
				cells[1][col] = new Cell(Color.WHITE, new Pawn(Color.WHITE));
			} else {
				cells[1][col] = new Cell(Color.BLACK, new Pawn(Color.WHITE));
			}
			isWhite = !isWhite;
		}
		isWhite = false;
		for (int col = 0; col < 8; col++) {
			if (isWhite) {
				cells[6][col] = new Cell(Color.WHITE, new Pawn(Color.BLACK));
			} else {
				cells[6][col] = new Cell(Color.BLACK, new Pawn(Color.BLACK));
			}
			isWhite = !isWhite;
		}

		// Adding rooks
		cells[0][0] = new Cell(Color.BLACK, new Rook(Color.WHITE));
		cells[0][7] = new Cell(Color.WHITE, new Rook(Color.WHITE));
		cells[7][0] = new Cell(Color.WHITE, new Rook(Color.BLACK));
		cells[7][7] = new Cell(Color.BLACK, new Rook(Color.BLACK));

		// Adding knights
		cells[0][1] = new Cell(Color.WHITE, new Knight(Color.WHITE));
		cells[0][6] = new Cell(Color.BLACK, new Knight(Color.WHITE));
		cells[7][1] = new Cell(Color.BLACK, new Knight(Color.BLACK));
		cells[7][6] = new Cell(Color.WHITE, new Knight(Color.BLACK));

		// Adding bishops
		cells[0][2] = new Cell(Color.BLACK, new Bishop(Color.WHITE));
		cells[0][5] = new Cell(Color.WHITE, new Bishop(Color.WHITE));
		cells[7][2] = new Cell(Color.WHITE, new Bishop(Color.BLACK));
		cells[7][5] = new Cell(Color.BLACK, new Bishop(Color.BLACK));

		// Adding kings and queens
		cells[0][3] = new Cell(Color.WHITE, new King(Color.WHITE));
		cells[0][4] = new Cell(Color.BLACK, new Queen(Color.WHITE));
		cells[7][3] = new Cell(Color.BLACK, new King(Color.BLACK));
		cells[7][4] = new Cell(Color.WHITE, new Queen(Color.BLACK));

		// Other empty cells
		isWhite = false;
		for (int row = 2; row < 6; row++) {
			for (int col = 0; col < 8; col++) {
				if (isWhite)
					cells[row][col] = new Cell(Color.WHITE);
				else
					cells[row][col] = new Cell(Color.BLACK);
				isWhite = !isWhite;
				if (col == 7)
					isWhite = !isWhite;
			}
		}

		this.board = new Board(cells);
	}
}
