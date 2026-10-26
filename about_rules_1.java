/*JAVAをプログラムを開発するためにはコンパイラとインタプリタのソフトウェアが必要。 
コンパイラは自分たちが記述したソースコードをコンパイルしてバイトコードに変換する。
インタプリタは内部のJVMの仕組みを使用しマシン語に変換して命令を実行する。
この開発環境はjdk-27をインストールしvsCode内でJDKの拡張機能をインストールしている。
*/


void main() {
    IO.println("こんにちは");

    //【変数とデータ型】

    //byteは非常に小さい整数
    byte glasses;
    glasses = 2;
    IO.println(glasses);

    //shortは小さい整数
    short age;
    age = 26;
    IO.println(age);

    //intは普通の整数
    int salary;
    salary = 150000;
    IO.println(salary);

    //longは大きな整数、末尾にLを記載
    long people;
    people = 100000000L;
    IO.println(people);

    //floatは曖昧でよい少数、末尾にFを記載
    float weight;
    weight = 36.1F;
    IO.println(weight);

    //doubleは普通の少数
    double pi;
    pi = 3.14;
    IO.println(pi);

    //booleanは真偽地
    boolean isError;
    isError = true;
    IO.println(isError);

    //charは1つの文字
    char initial;
    initial = '雅';
    IO.println(initial);

    //stringは文字列
    String name;
    name = "あいうえお";
    IO.println(name);

    //練習問題のpracticeメソッドを呼び出す
    practice();
}


    //練習問題
void practice(){
    int a = 3;
    int b = 5;
    IO.println("縦幅" + a + "横幅" + b +"の長方形の面積は、" + a * b);
}

