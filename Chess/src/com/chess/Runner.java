package com.chess;

import com.chess.game.Game;
import com.chess.game.enums.GameStaus;

public class Runner {

	private static Game game;

	static {
		game = new Game();
	}

	public static void main(String[] args) {
		GameStaus staus = game.play();
		System.out.println(staus);
	}

}
