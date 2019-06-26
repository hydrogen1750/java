package Download;

public class Main {

    public static void main(String[] args) {

        Absolute_Path path = new Absolute_Path();

        Insert_Backslash ins_B = new Insert_Backslash();
        String str = ins_B.Insert_Backslash(path.Absolute_Path());
        new Bitsadmin(str);
        
    }
}
