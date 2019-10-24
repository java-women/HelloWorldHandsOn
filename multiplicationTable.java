// 九九の一覧表をアウトプットするメソッド
void multiplicationTable() {

    // 1〜9の段を1段ずつ順番に計算する
    for (int i=1; i<10; i++){
        String line = "";    // 1段分の計算結果の文字列をいれる変数

        // iの数字に1〜9を順番に掛けていく
        for (int j=1; j<10; j++){
            line = line + i*j;

            // 行の最後(i×9)じゃなければカンマを付けたす
            if (j != 9){
                line = line + ", ";
            }
        }
        // 1段分の計算結果を標準出力にアウトプットする
        System.out.println(line);
    }
}
