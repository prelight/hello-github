import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("C:\\work\\app\\pleiades\\workspace\\RegexTry\\src\\temp.txt");
		//String text = Files.readString(file);
		List<String> lines = Files.readAllLines(file); // UTF-8


		List<String> result = new ArrayList<String>();

		// lines.forEach((a) => { System.out.println(a);} );
	   for(int i = 0; i < lines.size(); i++) {

	        Pattern p = Pattern.compile(".+ \\(.*\\)");
	        Matcher m = p.matcher(lines.get(i));

	        if (m.find()) {
	        	System.out.println(m.group(0));
	        	// System.out.println(m.group(1));
	        }

	        // System.out.println(m.find());
            // System.out.println(lines.get(i));
        }


		// System.out.println(text);


	}

}
