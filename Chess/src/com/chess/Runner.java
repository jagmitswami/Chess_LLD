package com.chess;

import com.chess.game.Game;

public class Runner {

	private static Game game;

	static {
		game = new Game();
	}

	public static void main(String[] args) {
		game.startGame();
	}

}
