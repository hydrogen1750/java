package Download;

import java.io.File;

public class Absolute_Path {

    String Absolute_Path() {
        String path = new File(".").getAbsoluteFile().getParent();//このファイルの絶対パスを取得
        return path;
    }
}
