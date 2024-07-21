package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  String name; // プレイヤーの名前
  ArrayList<Monster> monsterDeck = new ArrayList<>(); // 8体のモンスターを持つデッキ
  LinkedList<Integer> randomNumberList; // ランダムな0~4の数値リスト
  int hp; // プレイヤーのHP

  // コンストラクタでHPの初期値も設定
  Player(LinkedList<Integer> randomNumberList, String playerName, int initialHP) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hp = initialHP;
    drawMonsters(); // プレイヤー作成時にモンスターを8体ドロー
  }

  /**
   * モンスターを8体分ドローする．
   * 利用するランダムな値(0~4)はrandomNumberListから取得する
   */
  public void drawMonsters() {
    while (this.randomNumberList.size() >= 2 && this.monsterDeck.size() < 8) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Player: " + this.name + "\n");
    sb.append("HP: " + this.hp + "\n");
    sb.append("Deck:\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m);
    }
    return sb.toString();
  }
}
