import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
        return judgenumber(n);
    }
    
    // 数値を判断するメソッド
    public static String judgenumber(int n) {
    	String judged;
    	if (n < 0) throw new IllegalArgumentException("入力された数字が負の数です");
    	if (n < 20) judged = undertw(n);
    	else judged = abovetw(n);
    	return judged;
    }
    
    // 20未満の数字を変換するメソッド
    public static String undertw(int n) {
    	return null;
    }
    
    // 20以上の数字を変換するメソッド
    public static String abovetw(int n) {
    	return null;
    }
}
