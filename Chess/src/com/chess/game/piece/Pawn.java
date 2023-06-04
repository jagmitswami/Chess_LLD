package com.chess.game.piece;

import java.util.ArrayList;
import java.util.List;

import com.chess.game.enums.Color;

public class Pawn extends Piece {

	public Pawn(Color color) {
		super(color);
	}

	@Override
	public boolean move(int row, int col) {
		int[] currentPosition = currentPosition();
		List<int[]> validMoves = validMoves(currentPosition);

		if (validMoves.isEmpty()) {
			return false;
		}

		for (int[] move : validMoves) {
			if (currentPosition[0] == move[0] && currentPosition[1] == move[1]) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<int[]> validMoves(int[] currentPosition) {
		List<int[]> validMovesForPawn = new ArrayList<>();

		int row = currentPosition[0];
		int col = currentPosition[1];

		if (row == 1 && this.getColor() == Color.WHITE) {
			validMovesForPawn.add(new int[] { row + 1, col });
			validMovesForPawn.add(new int[] { row + 2, col });
		}
		return validMovesForPawn;
	}

	@Override
	public int[] currentPosition() {
		return null;
	}

	@Override
	public boolean anyAbstrationPresent(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "-" + color.toString().charAt(0) + "P";
	}

}
