package java_kadai.kadai_026;

/**
 * じゃんけん実行クラス
 */
public class JyankenExec_Chapter26 {
  public static void main(String[] args) {
    // じゃんけんクラスのインスタンス生成
    Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
    // 自分の手
    String myHand = jyanken.getMyChoice();
    // 対戦相手の手
    String yourHand = jyanken.getRandom();
    // じゃんけんの結果を出力
    jyanken.playGame(myHand, yourHand);
  }
}
