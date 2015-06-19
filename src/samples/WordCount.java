/*
 * Word Count of a file that is passed as First argument.
 * Assuming there are n lines and k words or less in each line.
 * 
 * */

package samples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		String data;
		FileReader fr = new FileReader(args[0]);
		HashSet uniqSet = new HashSet();
		List inputList = new ArrayList();
		List inputLists = new ArrayList();
		BufferedReader br = new BufferedReader(fr);
	
		while ((data = br.readLine()) != null) {
			inputList = Arrays.asList(data.split(" "));
		//for each line this loop is executed k times so total execution is n*k  
			for (int i = 0; i < inputList.size(); i++) {
				inputLists.add(inputList.get(i));
			}
		}
		//System.out.println(inputLists);
		//After the complete List is formed it is iterated master List size i.e assuming  nk words
		for (int j = 0; j < inputLists.size(); j++) {
			if (!uniqSet.contains(inputLists.get(j))) {
				uniqSet.add(inputLists.get(j));
			}
		}
		//System.out.println(uniqSet);
		Object[] uniqArr = uniqSet.toArray();
		//This is executed with a unique elements count.
		for(int k=0;k<uniqSet.size();k++){
			System.out.println(uniqArr[k]+" "+Collections.frequency(inputLists, uniqArr[k]));
		}
	}
	//Complexity is the sum of O(n*k+nk+m)
}
