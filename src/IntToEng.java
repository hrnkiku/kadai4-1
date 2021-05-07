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
    	else if(20 <=n && n <100)judged = abovetw(n);
    	else judged = other(n);
    	return judged;
    }
    
    // 20未満の数字を変換するメソッド
    public static String undertw(int n) {
    	final String[] englishNum1 = {"zero", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine",
    			"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	return englishNum1[n];
    }
    
    // 20以上100未満の数字を変換するメソッド
    public static String abovetw(int n) {
    	final String[] englishNum2 = {"twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	 String answer;
    	 
    	int divided = n / 10;
    	int surplus = n % 10;
    	if(n <20) answer = undertw(n);
    	else if(surplus ==0) answer = englishNum2[divided - 2];
    	else answer = englishNum2[divided - 2] + "-" + undertw(surplus);
    	
    	return (answer);
    }
    
    //100以上1000未満の数字を変換するメソッド
    public static String other(int n) {
    	final String[] englishNum3 = {"one hundred", "two hundred", "three hundred", "four hundred",
    			"five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
    	
    	 String answer;
    	 
    	int divided = n / 100;
    	int surplus = n % 100;
    	if(surplus ==0) answer = englishNum3[divided - 1];
    	else answer = englishNum3[divided - 1] + "-" + abovetw(surplus);
   
    	
    	return (answer);
    }
}
