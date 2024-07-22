package java_kadai.kadai_015;

/**
 * 車クラスの実行クラス
 */
public class CarExec_Chapter15 {
  public static void main(String[] args) {
    // インスタンス生成
    Car_Chapter15 car = new Car_Chapter15();
    // ギアチェンジの実行
    car.gearChange(3);
    // ギアチェンジ後の速度を表示
    car.run();
  }
}
