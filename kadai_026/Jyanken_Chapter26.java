package java_kadai.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

/**
 * じゃんけんクラス
 */
public class Jyanken_Chapter26 {
  /**
   * 自分のじゃんけんの手を入力する
   * 
   * @return 自分のじゃんけんの手
   */
  public String getMyChoice() {
    // 戻り値となる自分のじゃんけんの手を定義
    String input = "";

    while (true) {
      System.out.println("自分のじゃんけんの手を入力しましょう");
      System.out.println("グーはrockのrを入力しましょう");
      System.out.println("チョキはscissorsのsを入力しましょう");
      System.out.println("パーはpaperのpを入力しましょう");
      // Scannerクラスの生成
      Scanner scanner = new Scanner(System.in);
      // 入力した内容を取得
      input = scanner.next();
      // Scannerクラスのオブジェクトをクローズ
      scanner.close();

      // 入力された値の判定
      if (input.equals("r") || input.equals("s") || input.equals("p")) {
        // 入力された手が正しい場合
        return input;
      } else {
        // 入力された手が正しくない場合
        System.out.println("正しい手を入力しましょう");
      }
    }
  }

  /**
   * 対戦相手のじゃんけんの手を乱数で選ぶ
   * 
   * @return 対戦相手のじゃんけんの手
   */
  public String getRandom() {
    // じゃんけんの手を定義
    String[] jyankens = { "r", "s", "p" };
    // 乱数で対戦相手のじゃんけんの手を選ぶ
    int value = (int) Math.floor(Math.random() * 3);
    // 相手のじゃんけんの手を返す
    return jyankens[value];
  }

  /**
   * じゃんけんを行う
   */
  public void playGame(String myHand, String yourHand) {
    // じゃんけんの手を定義
    HashMap<String, String> map = new HashMap<>();
    map.put("r", "グー");
    map.put("s", "チョキ");
    map.put("p", "パー");

    // お互いのじゃんけんの手（日本語名）を取得
    String myHandJp = map.get(myHand);
    String yourHandJp = map.get(yourHand);

    // お互いのじゃんけんの手を出力
    System.out.println("自分の手は" + myHandJp + "、対戦相手の手は" + yourHandJp);

    // 勝敗メッセージを定義
    String msg = "";
    // お互いのじゃんけんの手を比較
    if (myHand.equals(yourHand)) {
      // お互いの手が同じ場合
      msg = "あいこです";
    } else if (myHand.equals("r") && yourHand.equals("s")
        || myHand.equals("s") && yourHand.equals("p")
        || myHand.equals("p") && yourHand.equals("r")) {
      msg = "自分の勝ちです";
    } else {
      msg = "自分の負けです";
    }

    // 勝敗を表示
    System.out.println(msg);
  }
}
