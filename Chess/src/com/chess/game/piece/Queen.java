package com.chess.game.piece;

import java.util.List;

import com.chess.game.enums.Color;

public class Queen extends Piece {

	public Queen(Color color) {
		super(color);
	}

	@Override
	public boolean move(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<int[]> validMoves(int[] currentPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] currentPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean anyAbstrationPresent(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "-" + color.toString().charAt(0) + "Q";
	}

}
