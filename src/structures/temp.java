package structures;

import java.util.ArrayList;

public class temp {
private static String prefix(String x, String y){
		
		if(x == null || y == null){
			return "";
		}
		
		int minstringlen = 0;
		
		if(x.length() < y.length()){
			minstringlen = x.length();
		}
		else{
			minstringlen = y.length();
		}
		
		for(int i = 0; i<minstringlen;i++){
			if(x.charAt(i) == y.charAt(i)){
				continue;
			}
			else{
				return x.substring(0, i);
			}
		}
		return x.substring(0, minstringlen);
	}
private static String hascommonprefix(ArrayList<String> words, String word){
	for(int i=0; i<words.size();i++){
//		if(prefix(words.get(i), word).length()>0){
//			System.out.println("the prefix is: "+prefix(words.get(i), word));
//			return prefix(words.get(i), word);
//		}
		System.out.println(prefix(words.get(i), word));
		
	}
	return "";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="";
		a="a";
		String x ="ab";
		String y = "ccc";
		String z = "cat";
		String b = "ca";
		System.out.println(prefix(x, y).length());
		System.out.println("".length());
		ArrayList<String> words = new ArrayList<String>();
		words.add("cat");
		words.add("peter");
		System.out.println("size of array: "+words.size());
		System.out.println(hascommonprefix(words, "tom").length());
		System.out.println(z.contains(b));
		System.out.println(a);
	
	}
	

}

//If the word has no common prefix________________________________________________________________________
//for(int i = 0; i<words.size(); i++){
//	System.out.println("words.get(i) right now is: "+words.get(i));
//if(prefix(words.get(i), word).length()==0){
//	System.out.println("the prefix is empty, which means there is no common prefix");
//
//	
//	lastelement(root.firstChild).sibling = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//	break;
//}
//else if(prefix(words.get(i), word).length()>0){
//	String commonprefix = prefix(words.get(i), word);
//	System.out.println("The target we search: "+search(root.firstChild, words.indexOf(words.get(i))).substr);
//	search(root.firstChild, words.indexOf(words.get(i))).substr=new Indexes(words.indexOf(words.get(i)), (short)(words.get(i).lastIndexOf(commonprefix)) , (short)(words.get(i).lastIndexOf(commonprefix)+commonprefix.length()-1));
//	search(root.firstChild, words.indexOf(words.get(i))).firstChild = new TrieNode(new Indexes(words.indexOf(words.get(i)), (short)(words.get(i).lastIndexOf(commonprefix)+commonprefix.length()), (short)(words.get(i).length()-commonprefix.length()+1)), null, null);
//	search(root.firstChild, words.indexOf(words.get(i))).firstChild.sibling = new TrieNode(new Indexes(words.indexOf(word), (short)(word.lastIndexOf(commonprefix)+commonprefix.length()), (short)(word.length()-commonprefix.length()+1) ), null, null);
//	break;
//}
//}