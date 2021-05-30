import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Pro010gramme3"; 
		Map<Character,Integer> hmap= new HashMap<>();
		
		char[] chArray = str.toCharArray();
		int chCount =0, intCount=0;
		
		for(int i=0;i<chArray.length;i++) {
			 if(Character.isAlphabetic(chArray[i])||Character.isDigit(chArray[i])) {
				if(!hmap.containsKey(chArray[i])) {
					hmap.put(chArray[i], 1);
				}
				
			}
		}
		for(Map.Entry<Character,Integer> entry: hmap.entrySet()) {
			if(Character.isAlphabetic(entry.getKey())) {
				chCount+=entry.getValue();
			}
			else {
				intCount+=entry.getValue();
			}
		}
		
		System.out.println("Character count :"+chCount);
		System.out.println("Integer count :"+intCount);
	}
	


}
