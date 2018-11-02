package leetCode;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Word{
	String text;
	int occurance;
	List <Integer> sentenceNumber;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getOccurance() {
		return occurance;
	}

	public void setOccurance(int occurance) {
		this.occurance = occurance;
	}

	public List <Integer> getSentenceNumber() {
		return sentenceNumber;
	}

	public void setSentenceNumber(List <Integer> sentenceNumber) {
		this.sentenceNumber = sentenceNumber;
	}
}

public class ConcordanceDemo {
	static StringBuilder fullTxt;

	public static void main(String[] args) {
		fullTxt = new StringBuilder();
		try {
			Scanner in = new Scanner(new FileReader("C:/Users/ASEN/workspace/Concepts/src/leetcode/inputPhrase.txt")); //Write the Absolute path of the Text File
			while (in.hasNextLine()) {  // Removing Line Breaks and replacing with a single space
				fullTxt.append(fullTxt.length()!=0?" ":"").append(in.nextLine());
			}
			in.close();

		} catch (Exception e) {
			System.out.println("Cannot Read File");
			e.printStackTrace();
			
		}

		List<Integer> sentenceDelimIndex = new ArrayList<Integer>();
		for(int i=0; i<fullTxt.length(); i++){
			if ((i < fullTxt.length() - 2) 
					&& (fullTxt.charAt(i) == '.' || fullTxt.charAt(i) == '?') // An English sentence ends with a  full stop or Question Mark followed by a space and then a Capital letter.
					&& fullTxt.charAt(i + 1) == 32
					&& (fullTxt.charAt(i + 2) >= 65 && fullTxt.charAt(i + 2) <= 90)) {
				
				sentenceDelimIndex.add(new Integer(i));
			}
		}
		//String[] allWords = fullTxt.toString().split(" ");
		
		String[] allWords = fullTxt.toString().split("\\s+");
		Map<String, Word> finalMap = new TreeMap<String, Word>();
		Word w;
		String aWord;
		for (String eachWrd : allWords) {
			aWord = trimSpecial(eachWrd);
			w = finalMap.get(aWord.toLowerCase());
			if (null == w) { // Add it to the Tree Map
				w = new Word();
				w.setText(aWord.toLowerCase());
				w.setOccurance(1);
				List retList = determineWordInSentence(aWord, sentenceDelimIndex, fullTxt, allWords);
				w.setSentenceNumber(retList);
				finalMap.put(aWord.toLowerCase(), w);
				
			}else{ //Modify the word Object and put it back
				w.setOccurance(w.getOccurance()+1);
				finalMap.put(aWord.toLowerCase(), w);
			}

		}
		for(String i: finalMap.keySet()){
			System.out.print(finalMap.get(i).getText()+"{"+finalMap.get(i).getOccurance()+":");
			int y = 0;
			for (Integer x : finalMap.get(i).getSentenceNumber()) {
				System.out.print((y==0?"":",")+x );
				y++;
			}
			System.out.print("}\n");		
		}
	}
	
	static List<Integer> determineWordInSentence(String word, List<Integer> sentenceDelimIndex, StringBuilder fullTxt, String[] allWords){
		List<Integer> retList = new ArrayList<Integer>();
		int tillIndex=0;
		int whichsen=0;
		for(String eachW: allWords){
			if(word.equalsIgnoreCase(trimSpecial(eachW))){
				int iC;
				Integer i;
				for(iC=0;iC<sentenceDelimIndex.size();iC++){
					i = sentenceDelimIndex.get(iC);
					whichsen = iC+1;
					if(tillIndex<i){
						retList.add(whichsen);
					}
					
				}
				if(tillIndex > sentenceDelimIndex.get(sentenceDelimIndex.size()-1)){
					retList.add(sentenceDelimIndex.size()+1);
				}
			}
			tillIndex+=eachW.length()+1;
		}
		return retList;
	}
	
	static String trimSpecial(String a){
		char[] arr = a.toCharArray();
		StringBuilder s = new StringBuilder();
		for(char c: arr){
			if((c>=65 && c<=90) || (c>=97 && c<=122)){
				s.append(c);
			}
		}
		return s.toString();
	}
}
