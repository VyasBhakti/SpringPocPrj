import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author 1229632
 *
 */
public class StrPatternMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Sample strs :  HAHAHA abcdabcdaxyzabcd 
		String input_str="cdTabTabTab", word="", sub_str="";
		int start_index;
		StringTokenizer tok = new StringTokenizer(input_str, " ");
		System.out.println(" strs : " + Arrays.toString(input_str.split("Tab")));
		/*while(tok.hasMoreTokens()){
			word= tok.nextToken();
			start_index=0;
			//System.out.println("word : " + word + " " + word.length());
			//sub_str= word.charAt(0) + "";//word.substring(start_index,sub_str.length());
			
			while(start_index < word.length()){
				sub_str= word.substring(start_index,start_index + 1);
				System.out.println(" sub_str " + sub_str);
				//System.out.println("start_index : " + start_index);
				//System.out.println("occurance ? " + 	word.indexOf(sub_str,start_index+1) );
				
				if(word.indexOf(sub_str,start_index+1) > 0 ){
					//get no. of characters in substring
					sub_str= word.substring(start_index,word.indexOf(sub_str,start_index+1));
//					System.out.println("sub_str : " + sub_str);
					word =  word.replaceAll(sub_str, "*" + sub_str+"*");
//					System.out.println(" substrings found : " + Arrays.toString(word.split(sub_str)) );
					if(word.split(sub_str).length >1 ){
						System.out.println(" substring : " + sub_str +
								" repeatation count : " + ((word.split(sub_str).length)-1) );
					}
					start_index = word.lastIndexOf("*")+1;
					System.out.println("start_index : " + start_index);
					System.out.println("word : " + word );
					sub_str="";
					
				}else{
					start_index ++;
				}
				
			}
		}  */
		
	}

}
