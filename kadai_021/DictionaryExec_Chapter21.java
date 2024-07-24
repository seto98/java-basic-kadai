package java_kadai.kadai_021;

/**
 * 辞書実行クラス
 */
public class DictionaryExec_Chapter21 {
  public static void main(String[] args) {
    // 辞書クラスのインスタンス生成
    Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
    // 調べる英単語の設定
    String[] list = { "apple", "banana", "grape", "orange" };
    // 辞書を調べる
    for (String word : list) {
      dictionary.searchDictionary(word);
    }
  }
}
