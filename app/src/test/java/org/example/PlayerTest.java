package org.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.List;

public class PlayerTest {

  @Test
  public void testRandomProfession() {
    // ランダムな数値リストを作成
    LinkedList<Integer> randomList = new LinkedList<>();
    for (int i = 0; i < 16; i++) {
      randomList.add(i % 5); // 簡単なサンプルデータ
    }

    // プレイヤーを作成
    Player player = new Player(randomList, "TestPlayer");

    // 職業が設定されていることを確認
    List<String> professions = List.of(
        "Warrior", "Mage", "Rogue", "Healer", "Hunter",
        "Bard", "Paladin", "Necromancer");

    assertTrue(professions.contains(player.profession));
  }
}
