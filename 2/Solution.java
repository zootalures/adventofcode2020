import java.util.*;
import java.util.regex.*;


public class Solution{
    public static void main(String ... args) throws Exception  {
	try(Scanner s = new Scanner(System.in)){
	    Pattern p = Pattern.compile("(\\d+)-(\\d+) (\\w): (\\w+)");
	    int numValid = 0;
	    
	    while(s.hasNextLine()){
		String line = s.nextLine();
		Matcher m = p.matcher(line);
		if(!m.matches()){
		    throw new Exception("boo" + line);
		}
		int from = Integer.parseInt(m.group(1));
		int to = Integer.parseInt(m.group(2));
		int chr = m.group(3).charAt(0);
		String word = m.group(4);
		long nchars =  word.chars().filter(c->c == chr).count();
		if(from <= nchars &&  nchars <= to ){
		    System.err.println("valid" + line);
		    numValid++ ;
		}else{
	   		    System.err.println("nalid" + line);

		}
	    }
	    System.out.println("" + numValid);
	}
    }
}
