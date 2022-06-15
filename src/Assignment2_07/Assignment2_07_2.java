package Assignment2_07;
// 완전한 수 찾기
public class Assignment2_07_2 {
	public static void main(String[] args) {
		
		// 합계 변수 선언
		int sum;
		// 입력
		for(int i=2;i<=500;i++) { // 2부터 500까지의 숫자 확인
			sum = 0; // 합계값 초기화
			for(int j=1;j<i;j++) {
				if(i%j==0) { // 1부터 i 직전까지의 값으로 나눠서 나머지가 0인 값 확인
					sum += j; // 합계에 더함
				}
			}
			if(sum == i) { // 총 합이 i값과 같은지 판별
				System.out.println(i+"는 완전수입니다.");
				System.out.print("[");
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						System.out.print(j);
						if(i!=j) {
							System.out.print(", ");
						}
					}
				}
				System.out.println("]");
			}
		}
	}
}
