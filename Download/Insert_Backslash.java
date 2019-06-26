package Download;

public class Insert_Backslash {

    String Insert_Backslash(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        int i = 0;
        int num = 0;

        while (num != -1) {
            num = sb.indexOf("\\", i);//\を検索する。
            if (num == -1) {//見つからなければ-1を返すので処理しないようにする。
                break;
            }
            i = 0;//一度初期化が必要。
            sb.insert(num, "\\");//cmdが認識するように\を追加する。
            i += num + 2;//追加した分ずらす。
        }
        String str_Ins_B = sb.toString();
        return str_Ins_B;
    }
}
