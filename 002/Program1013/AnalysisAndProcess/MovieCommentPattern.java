import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieCommentPattern {
	public static void main(String[] args) {
		String[] comment = {"ABC DVE WOW SANS SOSSOSO",
				"VDC SAX QSK SANS SOSSOSO",
				"ABC ASDSA ASDJKL fjlkadf wow good good",
				"great fjklsda fjlsda",
				"fjladf fjll;a fjlkad"
				};
		String[] tag = {"ABC", "WOW", "good", "Bad", "Papyrus", "DVE", "AABBCC", "AABXZA"};
		int[] reply = new int[tag.length];
		String regex = "[0-9<>~)/,!?('.:]";
		
		for (int i = 0; i < comment.length; i++) {
			comment[i] = comment[i].replaceAll(regex,"");
			for (int j = 0; j < tag.length; j++) {
				Pattern p = Pattern.compile(tag[j]);
				Matcher m = p.matcher(comment[i]);
				while (m.find()) {
					reply[j]++;
				}
			}
		
		}
		for (int j= 0; j < tag.length; j++) System.out.println(tag[j]+" : "+reply[j]);
	}
}
// reference : https://enterkey.tistory.com/353  https://m.blog.naver.com/PostView.nhn?blogId=bb_&logNo=220863282423&proxyReferer=https:%2F%2Fwww.google.com%2F
