package 빅데이터분석처리_예제;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigDataProcess {

	public static void main(String[] args) {
		String str = "빅데이터의 다음 단계는 예측분석이다. 이제 예측분석의 키워드를 이해하는 기업만 살아남는다.";
		
		//Pattern compile(String regex) 메소드는 주어진 정규 표현식으로부터 패턴을 만들어내는 메소드
		Pattern p = Pattern.compile("예측분석");
		
		//Matcher matcher(CharSequence input) 메소드는 패턴을 찾는 Matcher 객체를 만드는 메소드
		Matcher m = p.matcher(str);
		
		int count = 0;   //누계 변수는 0으로 초기화
		String word = null;
		
		//find() 메소드는 패턴이 일치하는 경우 true를 리턴하고, 그렇지 않으면 false 리턴
		while(m.find()) {
			//group() 메소드는 매칭된 부분을 반환하는 메소드
			word = m.group();
			count++;
		}
		System.out.println("분석결과: " + "패턴일치");
		System.out.println(word + " " + count + "개");
	}
}
