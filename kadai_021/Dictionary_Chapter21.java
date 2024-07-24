package java_kadai.kadai_021;

import java.util.HashMap;

/**
 * 辞書クラス
 */
public class Dictionary_Chapter21 {
  /**
   * 辞書の作成＆検索
   * 
   * @param word 検索ワード
   */
  public void searchDictionary(String word) {
    // 英単語の辞書マップを定義
    HashMap<String, String> dictionary = new HashMap<>();
    // 英単語と意味を辞書に追加
    dictionary.put("apple", "りんご");
    dictionary.put("peach", "桃");
    dictionary.put("banana", "バナナ");
    dictionary.put("lemon", "レモン");
    dictionary.put("pear", "梨");
    dictionary.put("kiwi", "キウィ");
    dictionary.put("strawberry", "いちご");
    dictionary.put("grape", "ぶどう");
    dictionary.put("muscat", "マスカット");
    dictionary.put("cherry", "さくらんぼ");

    // 引数の値を辞書から検索
    if (dictionary.get(word) == null) {
      System.out.println(word + "は辞書に存在しません");
    } else {
      System.out.println(word + "の意味は" + dictionary.get(word));
    }
  }
}
