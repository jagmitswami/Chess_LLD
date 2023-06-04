package com.chess.game;

public class Board {

	private Cell[][] cells = new Cell[8][8];

	public Board(Cell[][] cells) {
		this.cells = cells;
	}

	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}

}
