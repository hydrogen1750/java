import java.io.IOException;

public class OpenURL {

    void OpenURL() {
        String[] Command = {"cmd", "/c", "start https://www.google.co.jp/"}; //指定したURLを開く。
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(Command);
        } catch (IOException e) {
            e.printStackTrace();//エラーログ
        }

    }
}
