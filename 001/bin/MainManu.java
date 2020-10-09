import java.util.Scanner;
import BasicExample.*;

public class MainManu{
public static void main(String[] args) {
    int userinput;
    Scanner scanner = new Scanner(System.in);
   
    while(true){
    System.out.println("1. HelloJavaWorld 출력 \n2. 자료형 \n3. Scanner의 입력과 출력 \n4. 연산자 \n0. 종료");
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

            break;
        case 6:

            break;
           case 7:

            break;
        case 8:

            break;
        case 9:

            break;    
        default:
            break;
            }
        }
    }
}