
package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class SeMonsterGame {

  private HashMap<String, Player> playerMap = new HashMap<>();
  private LinkedList<Integer> randomNumberList;

  SeMonsterGame(LinkedList<Integer> randomNumberList) {
    this.randomNumberList = randomNumberList;
  }

  /**
   * プレイヤーの名前を指定してを追加するメソッド
   *
   * @param playerName プレイヤーの名前
   */
  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(randomNumberList, playerName));
  }

  /**
   * 指定したプレイヤーのモンスターを引き、そのデッキを表示するメソッド
   *
   * @param playerName プレイヤーの名前
   */
  void draw(String playerName) {
    Player player = this.playerMap.get(playerName);
    if (player != null) {
      player.drawMonsters();
      System.out.println(player);
    } else {
      System.out.println("Player not found: " + playerName);
    }
  }
}
