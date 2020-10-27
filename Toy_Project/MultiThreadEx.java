import java.util.Scanner;

public class MultiThreadEx extends TimerEx {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Runnable TimerTask = new TimerEx();
		Thread thread1 = new Thread(TimerTask);
				
		int a, b, result;
		int life = 3;
		int score = 0;
		String userinput ="";		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		System.out.println("1. 게임시작\n2. 하는 법\n3. 종료");
		
		userinput = scanner.nextLine();
		userinput = userinput.replace(" ", "");	
		
		switch (userinput) {
		case "1":
			thread1.start();
			while (life > 0) {//라이프가 다 소진될 때까지 게임을 실행
				a = (int) (Math.random() * 10 +1); // 1부터 10까지의 난수 생성하며 변수에 넣는다.
				b = (int) (Math.random() * 10 +1);
				
				System.out.println("Time Remain : "+TimerEx.time);	
				System.out.print(a+" * "+b+" = ? : ");
				
				try {// 유저가 숫자가 아닌 문자를 입력했을 경우 예외처리
					userinput = scanner.nextLine();
					result = Integer.parseInt(userinput);
				} catch (NumberFormatException e) {
					System.out.println("\n숫자만 입력해주세요");
					System.out.println("life -1\n");
					life--;
					continue;
				}		
				if (result == a*b) {//사용자가 입력한 값이 맞으면 스코어를 올리고 계속된다.
					score++;
					TimerEx.time+=2;
					continue;
				}
				else {//사용자가 입력한 값이 틀린 경우 라이프를 -1하고 계속한다.
					System.out.println("\nlife -1\n");
					life--;
				}
			}
			thread1.stop();
			System.out.println("\nYour Score : "+score);//라이프가 모두 소진되어 게임이 끝난 경우 스코어를 출력한다.
			System.out.println("Game Over\n");
			scanner.close();
			System.exit(0);
			
		case "2":
			System.out.println("\n화면에 표시되는 곱셈 연산을 수행하세요 틀릴 때마다 라이프가 차감되며 라이프는 총 3개입니다.\n");
			continue;
			
		case "3":
			 System.exit(0);
			 
		default:
			break;
		}		
	}
		
	}
}
