import java.io.IOException;

public class Shutdown {

    void Shutdown() {
        String[] Command = {"cmd", "/c", "shutdown /s /t 0"}; //cmdにシャットダウンを実行させる。
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(Command);
        } catch (IOException e) {
            e.printStackTrace();//エラーログ
        }

    }
}
