package AnalosysAndProcess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieCommentPattern {
	public static void main(String[] args) {
		String[] comment = {"<b>���� ��Ʈ������</b>,�������� ����� <��ȭ���� 474��° �̾߱�> ����: Doctor Strange(2016) �帣: ��庥ó,���� ��Ÿ��: 115�� ���� ���: �ϻ� �Ե��ó׸� ����: ���� ������ �⿬: ���׵�Ʈ �Ĺ���ġ, ����ÿ...",
				"���� �׷� �౸���� �̸��ϰ� ���� �Ұ��� �뷡�� ���ؼ� ������� �ϰڽ��ϴ�. ������ ���� ��ȭ, ���� �Ұ��� �뷡�� ��ȭ <b>���� ��Ʈ������</b> ost �뷡�����Դϴ� ���� �������� ���� ��ȭ�ε��� ���� �� ������ ���̶���Ʈ ��ȸ�� �ߴٰ� �մϴ�...",
				"���Ѱ����� ���� ���￡ �ö��� �� ģ���� ���� ���� ���� ��ȭ <b>���� ��Ʈ������</b>�� ���ԵǾ��µ���! �帣: ��Ÿ��,��ü Ÿ�Ӷ����� ��ҳ��̷� �뵿�ܰ� �Ǿ��ֳ� �ߴ���?���� <b>���� ��Ʈ������</b>�� �����ϴ� ������ �������� ��ҳ��̿� ��ұ�...",
				"���� �ó׸�ƽ ���Ϲ��� ���� �ְ�, �ְ��� ������ ����������� <b>���� ��Ʈ������</b>�� ���� �����߽��ϴ�. �帣: �׼�,���� ��ȭ�� ���� �е��� �ƽð����� �̹� '<b>���� ��Ʈ������</b>'���� ���� ���� ��ȭ���� �ܰ�� �⿬�ϴ� �ƿ�� �ƴ� ������...",
				"���ƿԾ��~!! ������� ����ι� �ϸ� ����ȭ��� ������ ���ܳ��� ����~ �̹��� �����ϴ� ��ȭ <b>���ͽ�Ʈ������</b>~~ �帣: ��Ÿ��,���� ��ȭ <b>���ͽ�Ʈ������</b>�� 10/26 �����߽��ϴ�. �������� ������ �޴� �̹� ��ȭ�� ���ΰ��� <b>���ͽ�Ʈ������</b>��..."
				};
		String[] tag = {"�׼�", "��庥ó", "����", "���", "��Ÿ��", "����", "������", "����"};
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

�׼� ~��
����ó ~��
���� ~��
reference : https://enterkey.tistory.com/353  https://m.blog.naver.com/PostView.nhn?blogId=bb_&logNo=220863282423&proxyReferer=https:%2F%2Fwww.google.com%2F

*/