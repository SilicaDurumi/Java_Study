import java.util.Scanner;
import AlgorithmClass.Algorithm_Vol;
import BasicExample.*;
//bin 폴더 내에 있는 폴더들 임포트


public class MainManu{
public static void main(String[] args) {
    int userinput;
    Scanner scanner = new Scanner(System.in);
   
    while(true){
    System.out.println("1. HelloJavaWorld 출력 \n2. 자료형 \n3. Scanner의 입력과 출력 \n4. 연산자 \n"+
    "5. 문자열배열 \n6. 입력받은 숫자의 합 계산\n7. Switch문\n8. 구구단 게임 \n9. 알고리즘\n0. 종료");// 메뉴화면구성
    System.out.print("실행할 프로그램의 숫자를 입력해주세요 >> ");
    userinput = scanner.nextInt(); //userinput에 스캔 값 넣기
    System.out.println("");

    switch (userinput) {
        case 0:
        System.exit(0); //프로그램 종료
        break;
        case 1:
            HelloJavaWorld.PrintHelloJAVAWorld();// BasicExample 폴더에 있는 HelloJavaWorld 클래스의 PrintHelloJAVAWorld()실행
            break;
        case 2:
            AddEx.variables();// BasicExample 폴더에 있는 AddEx 클래스의 variables()실행
            break;
        case 3:
            ScannerClassEx.VariableScanner();// BasicExample 폴더에 있는 ScannerClassEx 클래스의 VariableScanner()실행
            break;
        case 4:
            OperatorEx.Operator_PriorityAndIf();// BasicExample 폴더에 있는 OperatorEx 클래스의 Operator_PriorityAndIf()실행
            break;
        case 5:
            stringarray.PrintStringArray();// BasicExample 폴더에 있는 stringarray 클래스의 PrintStringArray()실행
            break;
        case 6:
            SumOfnumber.SumOf1toNumber();// BasicExample 폴더에 있는 Sum_Factorial 클래스의 SumOf1toNumber()실행
            break;
           case 7:
            SwitchEx.SwitchControl();// BasicExample 폴더에 있는 SwitchEx 클래스의 SwitchControl()실행
            break;
        case 8:
            Simple_Game.MuxOperationGame();// BasicExample 폴더에 있는 Simple_Game 클래스의 MuxOperationGame()실행
            break;
        case 9:
            Algorithm_Vol.AlgorithmSelectMenu();//AlgorithmClass 폴더에 있는 Algorithm_Vol 클래스의 AlgorithmSelectMenu() 실행
            break;    
        default:
            break;
            }
        }
        scanner.close();
    }
}
