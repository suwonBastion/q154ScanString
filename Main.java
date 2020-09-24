import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner stdin = new Scanner(System.in);
    
    System.out.print("문자열:");
    String s = stdin.next();

    System.out.print("반대로 읽으면 ");
    for (int i = s.length()-1;i>=0;i--){
      System.out.print(s.charAt(i));
    }
    System.out.println("입니다");

  }
}

//변수명.length()  괄호있음
//배열명.length

//charAt 문자열 안의 문자의 위치를 확인,
// 변수명.charAt(n) char 형으로 반환