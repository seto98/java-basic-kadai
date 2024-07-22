package java_kadai.kadai_015;

/**
 * 車クラス
 */
public class Car_Chapter15 {
  // 1速から5速のギア
  private int gear = 1;
  // ギアチェンジ後の速度
  private int speed = 10;

  /**
   * ギアの値のより速度を変える
   * 
   * @param afterGear ギア
   */
  public void gearChange(int afterGear) {
    System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

    // フィールド値の更新
    this.gear = afterGear;

    // ギアの値を判定
    switch (this.gear) {
      // ギア1の場合
      case 1:
        this.speed = 10;
        break;

      // ギア2の場合
      case 2:
        this.speed = 20;
        break;

      // ギア3の場合
      case 3:
        this.speed = 30;
        break;

      // ギア4の場合
      case 4:
        this.speed = 40;
        break;

      // ギア5の場合
      case 5:
        this.speed = 50;
        break;

      // 上記以外の場合
      default:
        this.speed = 10;
        break;
    }
  }

  /**
   * ギアチェンジ後の速度を表示
   */
  public void run() {
    System.out.println("速度は時速" + this.speed + "kmです");
  }
}
