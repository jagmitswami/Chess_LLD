package com.chess.game.piece;

import com.chess.game.enums.Color;

public class Bishop extends Piece {

	public Bishop(Color color) {
		super(color);
	}

	@Override
	public boolean move(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "-" + color.toString().charAt(0) + "B";
	}

}