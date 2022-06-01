package Assignment1_16._4;

//은행 계좌 클래스(Ver.3) 사용 예
import java.util.Scanner;

import Assignment1_16._1.Day;

public class AccountTester {
 public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("계좌 개설 수:");
    int n = stdIn.nextInt();
    Account[] a = new Account[n];
    
    for (int i = 0; i < a.length; i++) {
       System.out.print("[0]...간이 [1]...상세:");
       int type = stdIn.nextInt();
       
       System.out.println("계좌 정보를 입력하세요.");
       System.out.print("명   의:"); String name = stdIn.next();
       System.out.print("번   호:"); String no = stdIn.next();
       if (type == 0)
          a[i] = new Account(name, no);
       else {
          System.out.print("잔   고:"); int balance = stdIn.nextInt();
          System.out.print("개설  연도:"); int y = stdIn.nextInt();
          System.out.print("개설  월:"); int m = stdIn.nextInt();
          System.out.print("개설  일:"); int d = stdIn.nextInt();
          a[i] = new Account(name, no,balance,new Day(y,m,d));
       }
       
       System.out.println("계좌  기본  정보:" + a[i]);
       System.out.println("식별  번호:" + a[i].getId());
       System.out.println("개설  일:" + a[i].getOpenDay().toString());
    }
 }
}