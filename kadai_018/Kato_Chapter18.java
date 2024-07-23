package java_kadai.kadai_018;

/**
 * 親クラス
 */
abstract public class Kato_Chapter18 {
  // 姓
  public String familyName = "加藤";
  // 名
  public String givenName;
  // 住所
  public String address = "東京都中野区〇×";

  /**
   * 共通の紹介を出力
   */
  public void commonIntroduce() {
    // 名前の紹介
    System.out.println("名前は" + familyName + givenName + "です");
    // 住所の紹介
    System.out.println("住所は" + this.address + "です");
  }

  /**
   * 個別の紹介を出力
   */
  abstract public void eachIntroduce();

  /**
   * 紹介を実行
   */
  public void execIntroduce() {
    // 名前と住所の紹介
    this.commonIntroduce();
    // 個別の紹介
    this.eachIntroduce();
    // 改行
    System.out.println();
  }

}
