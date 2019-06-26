package Download;

import java.io.IOException;

public class Bitsadmin {

    Bitsadmin(String str) {
        String[] Command = {"cmd.exe", "/c", "start /high /min bitsadmin.exe /transfer download https://www.google.com/logos/doodles/2019/2019-womens-world-cup-day-18-6243568163749888-law.gif " + str + "\\Download.gif"}; //bitsadmin /transfer ＜ジョブ名＞ ＜URL＞ ＜保存先ファイル名＞
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(Command);
        } catch (IOException e) {
            e.printStackTrace();//エラーログ
        }
    }
}
