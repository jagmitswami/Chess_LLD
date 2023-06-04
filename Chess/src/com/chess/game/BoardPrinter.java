package com.chess.game;

public class BoardPrinter {
	public static void printBoard(Board board) {

		// Creating board cells according to this
		int boxSize = 5;

		Cell[][] cells = board.getCells();
		// Print the top border
		printBorder(boxSize);

		// Iterate through rows
		for (int row = 0; row < 8; row++) {
			System.out.print("			|");
			for (int col = 0; col < 8; col++) {

				// Print the left border of the cell

				// Print the cell value with padding
				String cellValue;
				if (cells[row][col].getPiece() != null)
					cellValue = cells[row][col].getColor().toString().charAt(0) + "" + cells[row][col].getPiece();
				else
					cellValue = "" + cells[row][col].getColor().toString().charAt(0);
				int padding = Math.abs(boxSize - cellValue.length());
				System.out.print(" ".repeat(padding / 2));
				System.out.print(cellValue);
				System.out.print(" ".repeat(padding - padding / 2));

				// Print the right border of the cell
				System.out.print("|");
			}

			// Move to the next line
			System.out.println();

			// Print the horizontal border after each row
			printBorder(boxSize);
		}
	}

	// Method to print the horizontal border
	private static void printBorder(int boxSize) {
		System.out.print("			+");
		for (int col = 0; col < 8; col++) {
			System.out.print("-".repeat(boxSize));
			System.out.print("+");
		}
		System.out.println();
	}
}
