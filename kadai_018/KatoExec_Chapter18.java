package java_kadai.kadai_018;

/**
 * 実行クラス
 */
public class KatoExec_Chapter18 {
  public static void main(String[] args) {
    // インスタンスの生成
    KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
    KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
    KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

    // 親クラスの名フィールドの値をセット
    taro.setGivenName("太郎");
    ichiro.setGivenName("一郎");
    hanako.setGivenName("花子");

    // 紹介を実行
    taro.execIntroduce();
    ichiro.execIntroduce();
    hanako.execIntroduce();
  }
}
