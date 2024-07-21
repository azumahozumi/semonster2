package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(0, 0);
    Assert.assertEquals("SlimeRarity:[0]\n", monster.toString());

  }

}
