package AnalosysAndProcess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieCommentPattern {
	public static void main(String[] args) {
		String[] comment = {"<b>닥터 스트레인지</b>,마법계의 어벤져스 <영화리뷰 474번째 이야기> 영제: Doctor Strange(2016) 장르: 어드벤처,경이 런타임: 115분 관람 장소: 일산 롯데시네마 감독: 스콧 데릭슨 출연: 베네딕트 컴버베치, 레이첼...",
				"ㅎㅎ 그럼 축구얘기는 이만하고 오늘 소개할 노래에 대해서 설명토록 하겠습니다. 모험을 느낀 영화, 오늘 소개할 노래는 영화 <b>닥터 스트레인지</b> ost 노래모음입니다 아직 개봉되지 않은 영화인데요 어젠 가 그젠가 하이라이트 상영회를 했다고 합니다...",
				"내한공연을 보러 서울에 올라갔을 때 친구와 만나 마블 신작 영화 <b>닥터 스트레인지</b>를 보게되었는데요! 장르: 판타지,대체 타임라인이 쥐불놀이로 대동단결 되어있나 했더니?ㅋㅋ <b>닥터 스트레인지</b>에 등장하는 일종의 마법진이 쥐불놀이와 닮았기...",
				"마블 시네마틱 유니버스 현존 최고, 최강의 마법사 슈퍼히어로인 <b>닥터 스트레인지</b>가 드디어 등장했습니다. 장르: 액션,경이 영화를 보신 분들은 아시겠지만 이번 '<b>닥터 스트레인지</b>'에는 기존 마블 영화에서 단골로 출연하던 아우디가 아닌 람보르...",
				"돌아왔어요~!! 어느샌가 히어로물 하면 마블영화라는 공식이 생겨나고 있죠~ 이번에 개봉하는 영화 <b>닥터스트레인지</b>~~ 장르: 판타지,경이 영화 <b>닥터스트레인지</b>는 10/26 개봉했습니다. 전세계의 집중을 받는 이번 영화의 주인공은 <b>닥터스트레인지</b>란..."
				};
		String[] tag = {"액션", "어드벤처", "공포", "드라마", "판타지", "경이", "마법사", "마블"};
		int[] reply = new int[tag.length];
		String regex = "[A-Za-z0-9<>~)/,!?('S.:]";
		
		for (int i = 0; i < comment.length; i++) {
			comment[i] = comment[i].replaceAll(regex,"");
			System.out.println(comment[i]);
			
			for (int j = 0; j < tag.length; j++) {
				if (comment[j].compareTo(tag[j])==0) reply[j]++;
				}
			}
		for (int j= 0; j < reply.length; j++) System.out.println(tag[j]+" : "+reply[j]);
		
		}
	}
/*

액션 ~개
어드밴처 ~개
공포 ~개
reference : https://enterkey.tistory.com/353  https://m.blog.naver.com/PostView.nhn?blogId=bb_&logNo=220863282423&proxyReferer=https:%2F%2Fwww.google.com%2F

*/