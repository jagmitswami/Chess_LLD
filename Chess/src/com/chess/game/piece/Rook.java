package com.chess.game.piece;

import java.util.List;

import com.chess.game.enums.Color;

public class Rook extends Piece {

	private boolean isMoved;

	public Rook(Color color) {
		super(color);
		isMoved = false;
	}

	@Override
	public boolean move(int[] current, int[] next) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected List<int[]> validMoves(int[] currentPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean anyAbstrationPresent(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "-" + color.toString().charAt(0) + "R";
	}

}
