import java.util.Scanner;

import AlgorithmClass.Algorithm_Vol;
import BasicExample.*;

public class MainManu{
public static void main(String[] args) {
    int userinput;
    Scanner scanner = new Scanner(System.in);
   
    while(true){
    System.out.println("1. HelloJavaWorld 출력 \n2. 자료형 \n3. Scanner의 입력과 출력 \n4. 연산자 \n"+
    "5. 문자열배열 \n6. 입력받은 숫자의 합 계산\n7. Switch문\n8. 구구단 게임 \n9. 알고리즘\n0. 종료");
    System.out.print("실행할 프로그램의 숫자를 입력해주세요 >> ");
    userinput = scanner.nextInt();
    System.out.println("");

    switch (userinput) {
        case 0:
        System.exit(0);
        break;
        case 1:
            HelloJavaWorld.PrintHelloJAVAWorld();
            break;
        case 2:
            AddEx.variables();
            break;
        case 3:
            ScannerClassEx.VariableScanner();
            break;
        case 4:
            OperatorEx.Operator_PriorityAndIf();
            break;
        case 5:
            stringarray.PrintStringArray();
            break;
        case 6:
            Sum_Factorial.SumOf1toNumber();
            break;
           case 7:
            SwitchEx.SwitchControl();
            break;
        case 8:
            Simple_Game.MuxOperationGame();
            break;
        case 9:
            Algorithm_Vol.AlgorithmSelectMenu();
            break;    
        default:
            break;
            }
        }
    }
}