package org.example;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "Slime", "Sahagin", "Dragon", "Durahan", "Sea Serpent" };
    return monsters[mnumber];
  }

  void evolve() {
    this.name = "Evolved " + this.name;
  }

  @Override
  public String toString() {

    return this.name + "Rarity:[" + this.rare + "]\n";
  }
}
