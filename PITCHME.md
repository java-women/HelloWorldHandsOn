# はじめに
2019/10/26開催のSalesforce女子部×Java女子部×JDKソムリエコラボ勉強会で実施する、Javaハンズオンの資料です。  
本ハンズオンでは、ご自分のマシンにJDKMAN!というツールを使ってJDK（Javaを動かすために必要なソフトウェアがまとまったもの)をインストールして、JShellというツールから実際にJavaを動かしてみることが目的です。  
  
事前準備やハンズオンの中でわからないことがあれば、お気軽にJava女子部スタッフにご質問ください！  

---
# 0.事前準備
## 0-1.Cygwinのインストール(Windowsのみ)
SDKMAN!はUnixベースのOS向けに作られているので、Windowsではそのままだと動きません。  
なので、Windowsを使う場合は事前にCygwinというWindows上でLinuxと同じようなコマンドを使えるようにするツールをインストールして、Cygwinを通してSDKMAN!を使います。  
Macの人は標準のターミナルでSDKMAN!を動かせるので、Cygwinのインストールは不要です。  

---
### Cygwinのダウンロード
下記のWebサイトからCygwinのインストーラーをダウンロードします。  
Cygwin https://cygwin.com  
  
ページ中程にある**Installing Cygwin**からインストーラーがダウンロードできます。  
ご自分のマシンのOSが64bit版の場合はsetup-x86_64.exe (64-bit installation)を、32bit版の場合はsetup-x86.exe(32-bit installation)をクリックしてダウンロードしてください。  
  
ご自分のPCのバージョンがどちらかわからない場合は、こちらのヘルプ等を参考にご確認ください。  
https://support.microsoft.com/ja-jp/help/15056/windows-32-64-bit-faq  

---
### Cygwinのインストール
ダウンロードしたインストーラーを起動してCygwinをインストールします。
- Download SourceはInstall from Internetを選んでください。
- Choose A Download SiteはどこでもOKです。とりあえず**.jp等の近いところを選んでおきましょう。
- インストール先やパッケージは今回はデフォルトのままで大丈夫です。今後もCygwinを使うようであれば、エディタ等入れておくと便利かもしれません。

---
### Cygwinの起動
デスクトップかスタートメニューのショートカットアイコン、またはインストール先のディレクトリに作成されたアイコンからCygwinを起動します。
黒いウィンドウが表示されたらOKです！

---
## 0-2.SDKMAN!のインストール(Win、Mac、Linux共通)
JDKをインストールしたり、使用するJDKのバージョンを切り替えたりするためのツール SDKMAN! https://sdkman.io をインストールします。

---
### SDKMAN!のインストール
Mac、Linux等を使用している方はターミナルを、Windowsを使用している方はCygwinを起動して、下記のコマンドを入力して実行します。
```
$ curl -s "https://get.sdkman.io" | bash
```
画面に完了(All done!)の表示が出たら、続けて下記のコマンドを実行します。
```
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
```
インストールが成功したかチェックするためにsdkコマンドでバージョン表示してみましょう。
```
$ sdk version
```
SDKMAN 5.7.3+337 のようにバージョン番号が表示されれば準備OKです。お疲れ様でした！

---
# 1.SDKMANでJavaをインストールしてみよう
## 1-1.SDKMANでインストールできるJavaの種類を見てみる
## 1-2.SDKMANでJDKをインストールしてみる
---
# 2.JShellでHelloWorld!してみよう
## 2-1.ちょっとだけコマンドを紹介
## 2-2.JShellを起動する
## 2-3.Javaを書いてみる（Hello World!)
---
# EX.もうちょっとプログラムにチャレンジしてみる
