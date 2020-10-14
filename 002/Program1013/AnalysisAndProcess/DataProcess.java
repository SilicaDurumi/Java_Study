package AnalysisAndProcess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataProcess {

	public static void main(String[] args) {
		String str = "BigData's Nextstep is PredictAnalysis";
		Pattern p = Pattern.compile("PredictAnalysis"); // Analysis
		Matcher m = p.matcher(str); // ''
		int count = 0;
		String word = null;
		
		while (m.find()) {
			word = m.group();
			count++;
		}
		System.out.println(word);
	}
	
}
