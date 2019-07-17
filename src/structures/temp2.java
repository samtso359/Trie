package structures;

public class temp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(root.firstChild == null){
//			
//			root.firstChild = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//			}
//			else if(root.firstChild!=null){
//				System.out.println("the words.get(root.firstChild.substr.wordIndex) is: "+words.get(root.firstChild.substr.wordIndex));
//				System.out.println("The word now is: "+word);
//				System.out.println("The greatest common prefix is: "+prefix(words.get(root.firstChild.substr.wordIndex), word));
//				
//				//If the word has no common prefix________________________________________________________________________
//				if(prefix(words.get(root.firstChild.substr.wordIndex), word).length()==0){
//					System.out.println("the prefix is empty, which means there is no common prefix");
//					root.firstChild.sibling = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//				}
//				
//				//If the word has common prefix___________________________________________________________________________
//				else{
//					String commonprefix = prefix(words.get(root.firstChild.substr.wordIndex), word);
//					//System.out.println("the triblets so far is: "+root.firstChild.substr);
//					//System.out.println("the index of the previous word is: "+words.indexOf(words.get(root.firstChild.substr.wordIndex)));
//					//System.out.println("the commonprefix begins at index: "+words.get(root.firstChild.substr.wordIndex).indexOf(commonprefix));
//					int endcommon = (words.get(root.firstChild.substr.wordIndex).indexOf(commonprefix)+commonprefix.length()-1);
//					//System.out.println("the end of commonprefix is at the index: "+endcommon);
//					root.firstChild.substr = new Indexes(words.indexOf(words.get(root.firstChild.substr.wordIndex)), (short)words.get(root.firstChild.substr.wordIndex).indexOf(commonprefix), (short)endcommon);			
//					root.firstChild.firstChild= new TrieNode(new Indexes(words.indexOf(words.get(root.firstChild.substr.wordIndex)), (short)(endcommon+1), (short)((words.get(root.firstChild.substr.wordIndex).length())-endcommon)), null, null);
//					root.firstChild.firstChild.sibling = new TrieNode(new Indexes(words.indexOf(word), (short)(endcommon+1), (short)((words.get(root.firstChild.substr.wordIndex).length())-endcommon)), null, null);
//					
//					
//					
//				}
//			
//			}
		
		
		
//		public void insertWord(String word) {
//			word = word.toLowerCase();
//			words.add(word);
//			
//				if(root.firstChild == null){
//					root.firstChild = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//					}
//					else if(root.firstChild!=null){
//						System.out.println("The word now is: "+word);
//						//If the word has no common prefix________________________________________________________________________
//						
//						
//						if(hascommonprefix(words, word).length()==0){
//							System.out.println("the prefix is empty, which means there is no common prefix");
//						
//							
//							lastelement(root.firstChild).sibling = new TrieNode(new Indexes(words.indexOf(word), (short)word.indexOf(word), (short)(word.length()-1)), null, null);
//							
//						}
//						else if(hascommonprefix(words, word).length()>0){
//							String commonprefix = hascommonprefix2(words, word);
//							System.out.println("commonprefix is: "+commonprefix);
//							System.out.println("node has common prefix2: "+(nodehascommon(root.firstChild, commonprefix)));
//							System.out.println("word has common prefix: "+(wordhascommon(commonprefix)));
//							System.out.println("search2 of word has common prefix: "+search2(root.firstChild,wordhascommon(commonprefix)));
//							System.out.println("search2 of nodehascommon: "+search2(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).substr);
//							System.out.println("search3 of nodehascommon: "+search3(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).substr);
//							
//							TrieNode temp = search2(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex));
//							Indexes indtemp = new Indexes(nodehascommon(root.firstChild, commonprefix).substr.wordIndex,(short) searchparent2(root.firstChild, temp),(short)(((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()-1) );
//							System.out.println("indtemp is: "+indtemp);
//							System.out.println(indtemp+" already exist? "+alreadyexist(root.firstChild, indtemp));
//							System.out.println("searchparent2 returns: "+searchparent2(root.firstChild, temp));
//							System.out.println("alreadyexist2 returns: "+alreadyexist2(root.firstChild, temp));
//							System.out.println("searchparent3 returns: "+searchparent3(root.firstChild, temp));
//							
//							
//							
//							if(alreadyexist(root.firstChild, indtemp)==false){
//							temp.substr.wordIndex= nodehascommon(root.firstChild, commonprefix).substr.wordIndex;
//							
//							temp.substr.startIndex = (short) searchparent2(root.firstChild, temp);
//							temp.substr.endIndex = (short) (((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()-1);
////							search2(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).substr=new Indexes(nodehascommon(root.firstChild, commonprefix).substr.wordIndex, (short)((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).indexOf(commonprefix)) , (short)(((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()-1));
//							temp.firstChild = new TrieNode(new Indexes(nodehascommon(root.firstChild, commonprefix).substr.wordIndex, (short)(((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()), (short)(words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex).length()-1)), null, null);
//							temp.firstChild.sibling =new TrieNode(new Indexes(words.indexOf(word), (short)search2(root.firstChild,wordhascommon(commonprefix)).substr.startIndex, (short)(word.length()-1)), null, null);;
//							//lastelementfc(search3(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex))).firstChild = new TrieNode(new Indexes(nodehascommon(root.firstChild, commonprefix).substr.wordIndex, (short)(((words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).lastIndexOf(commonprefix))+commonprefix.length()), (short)(words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex).length()-1)), null, null);
//
//							}
//							else if(alreadyexist(root.firstChild, indtemp)==true){
//								System.out.println(nodehascommon(root.firstChild, commonprefix));
//								lastelement(nodehascommon(root.firstChild, commonprefix).firstChild).sibling =new TrieNode(new Indexes(words.indexOf(word), (short)search2(root.firstChild,wordhascommon(commonprefix)).substr.startIndex, (short)(word.length()-1)), null, null);
//							}
//							
//							
//							//search2(root.firstChild,wordhascommon(commonprefix)).sibling = new TrieNode(new Indexes(words.indexOf(word), (short)search2(root.firstChild,wordhascommon(commonprefix)).substr.startIndex, (short)(word.length()-1)), null, null);
//							
//							//System.out.println(search2(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).substr);
//							//search2(root.firstChild, words.get(nodehascommon(root.firstChild, commonprefix).substr.wordIndex)).sibling = new TrieNode(new Indexes(words.indexOf(word), (short)(word.length()-commonprefix.length()), (short)(word.length()-1)), null, null );
//							
//
//						}
//						
//						
//						}
//						}
//						
	}

}
