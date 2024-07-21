/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.Monster;

import com.google.common.base.Strings;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class App {
  final static Random random = new Random();
  final static int maxRandomNumber = 4;// ランダムな数値の最大値(0～4)

  public String getGreeting() {
    return "Hello SEMonster";
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    SeMonsterGame mf = new SeMonsterGame(createRandomList(10));
    String name = "";
    Scanner scanner = new Scanner(System.in);
    while (name.isEmpty()) {
      System.out.print("名前を入力して下さい＞");
      name = scanner.nextLine();
    }
    mf.addPlayer(name);
    mf.draw(name);

  }

  /**
   * 指定した数の0~4(maxRandomNumber)のランダムな数値を作成し，LinkedListに格納して返却する
   *
   * @param randNum
   * @return
   */
  public static LinkedList<Integer> createRandomList(int count) {
    LinkedList<Integer> randNumList = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      randNumList.add(random.nextInt(maxRandomNumber + 1));
    }

    return randNumList;
  }

}
