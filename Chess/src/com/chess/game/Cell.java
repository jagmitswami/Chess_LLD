package com.chess.game;

import com.chess.game.enums.Color;
import com.chess.game.piece.Piece;

public class Cell {

	final Color color;
	Piece piece;

	public Cell(Color color) {
		this.color = color;
	}

	public Cell(Color color, Piece piece) {
		this.color = color;
		this.piece = piece;
	}

	public Color getColor() {
		return color;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	@Override
	public String toString() {
		return "Cell [color=" + color + ", piece=" + piece + "]";
	}

}
