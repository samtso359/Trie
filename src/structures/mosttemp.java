package structures;

public class mosttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//public void insertWord(String word) {
//	word = word.toLowerCase();
//	words.add(word);
//	
//		if(root.firstChild == null){
//			root.firstChild = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//			}
//			else if(root.firstChild!=null){
//				System.out.println("the words.get(root.firstChild.substr.wordIndex) is: "+words.get(root.firstChild.substr.wordIndex));
//				System.out.println("The word now is: "+word);
//				//If the word has no common prefix________________________________________________________________________
//				
//				
//				if(hascommonprefix(words, word).length()==0){
//					System.out.println("the prefix is empty, which means there is no common prefix");
//				
//					
//					lastelement(root.firstChild).sibling = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//					
//				}
//				else if(hascommonprefix(words, word).length()>0){
//					String commonprefix = hascommonprefix(words, word);
//					System.out.println("the commonprefix is: "+commonprefix);
//					System.out.println("the node that has the common prefix is: "+ nodehascommon(root.firstChild, commonprefix).substr);
//					System.out.println("the last element is: "+lastelement(nodehascommon(root.firstChild, commonprefix).firstChild));
//					nodehascommon(root.firstChild, commonprefix).substr = new Indexes(nodehascommon(root.firstChild, commonprefix).substr.wordIndex, (short)((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix)) , (short)(((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()-1));
//					nodehascommon(root.firstChild, commonprefix).firstChild = new TrieNode(new Indexes(nodehascommon(root.firstChild, commonprefix).substr.wordIndex, (short)(((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()), (short)(words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex).length()-commonprefix.length()+1)), null, null);
//					(lastelement(nodehascommon(root.firstChild, commonprefix).firstChild)).sibling = new TrieNode(new Indexes(words.indexOf(word), (short)(word.lastIndexOf(commonprefix)+commonprefix.length()), (short)(word.length()-commonprefix.length()+1)) , null, null);
////				
//					
//				}
//				
//				
//				}
//				}