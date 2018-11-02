import java.util.ArrayList;
import java.util.List;


public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "This, is , story";
		List<String> lst = GetWords(txt, ',');
		for(String word: lst){
			System.out.println(word.trim());
		}
		
		
	}
	public static List<String> GetWords(String Text, char Sep){
	    List<String> retArr = new ArrayList<String>(); 
	    if(null != Text){
	        char[] chars = Text.toCharArray();
	        StringBuffer word = new StringBuffer();
	        for(char c: chars){
	            if(c != Sep){
	                word.append(c+"");
	            }
	            else{
	                 retArr.add(word.toString());
	                 word = new StringBuffer();
	            }
	            
	        }
	        if(word.length() != 0){
	        	retArr.add(word.toString());
	        }
	        
	    }
	    
	    return retArr;

	}

}
