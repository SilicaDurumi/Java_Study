package GettingStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentEx {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("Java 8 new Feature UTF-8.txt");// '/Java 8 new Feature.txt' = '~Path\\Java 8 new Feature.txt
		Stream<String> stream;
	
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out :: println); // fileString -> System.out.Println(fileString) 
		stream.close();
	}
}


































