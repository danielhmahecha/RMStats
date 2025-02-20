package RMStats;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.io.BufferedReader; 
import java.io.FileReader;

public class RMStats {
	
	private static HashMap<String, RMElement> collection = new HashMap<>();
	private static HashMap<String, repeatClass> repeatClasses = new HashMap<>();
	private static HashMap<String, repeatFamily> repeatFamilies = new HashMap<>();
	
	public static void getSWScoreAverage() {
		int total = 0;
		float sum = 0;
		for (String elementID: collection.keySet()) {
			RMElement e = collection.get(elementID);
			sum += e.getSWScore();
			total++;
		}
		float avg = sum/total;
		System.out.println("SWScore Average: "+Float.toString(avg));
	}
	
	public static void getGrossCounts() {
		int totalElements = collection.size();
		System.out.println("Total of Elements: "+Integer.toString(totalElements));
		for (String rc: repeatClasses.keySet()) {
			System.out.println("\n\t==========");
			System.out.println("\t"+rc);
			System.out.println("\t==========\n");
			int totalClass = 0;
			
			for (String fm: repeatClasses.get(rc).getFamilies()) {
				int elementsFamily = repeatFamilies.get(fm).getElementIDs().size();
				totalClass += elementsFamily;
				float percentage = (float)elementsFamily/totalElements *100;
				String roundPercentage = String.format("%.2f", percentage);
				System.out.println("\t "+fm+": "+elementsFamily+" ("+roundPercentage+"%)");
			}
			
			float classPercentage = (float)totalClass/totalElements *100;
			String roundClassPercentage = String.format("%.2f", classPercentage);
			System.out.println("\n\t Total "+rc+": "+totalClass+" ("+roundClassPercentage+"%)");

		}
	}
	
	public static void getAvgScoresSWDiv() {
		System.out.println("\n|Class/Family|\t|mean SWScore|\t|min. SWScore|\t|max. SWScore|\t|mean %Div.|\t|min. %Div.|\t|max. %Div.|");

		for (String rc: repeatClasses.keySet()) {		
			for (String fm: repeatClasses.get(rc).getFamilies()) {
				
				float avgSWScore = repeatFamilies.get(fm).getAvgSWScore();
				float minSWScore = repeatFamilies.get(fm).getMinSWScore();
				float maxSWScore = repeatFamilies.get(fm).getMaxSWScore();

				float avgDivPerc = repeatFamilies.get(fm).getAvgDivPerc();
				float minDivPerc = repeatFamilies.get(fm).getMinDivPerc();
				float maxDivPerc = repeatFamilies.get(fm).getMaxDivPerc();
				
				String roundAvgSWScore = String.format("%.2f", avgSWScore);
				String roundMinSWScore = String.format("%.2f", minSWScore);
				String roundMaxSWScore = String.format("%.2f", maxSWScore);

				String roundAvgDivPerc = String.format("%.2f", avgDivPerc);
				String roundMinDivPerc = String.format("%.2f", minDivPerc);
				String roundMaxDivPerc = String.format("%.2f", maxDivPerc);
				
				System.out.println(rc + "/" + fm + "\t" 
					    + roundAvgSWScore + "\t" + roundMinSWScore + "\t" + roundMaxSWScore + "\t"
					    + roundAvgDivPerc + "\t" + roundMinDivPerc + "\t" + roundMaxDivPerc);
			}
		}
	}
	
	public static void getAvgScoresDelIns() {
		System.out.println("\n|Class/Family|\t|mean %Del.|\t|min. %Del.|\t|max %Del.|\t|mean "
				+ "%Ins|\t|min %Ins.|\t|max %Ins.|");

		for (String rc: repeatClasses.keySet()) {		
			for (String fm: repeatClasses.get(rc).getFamilies()) {
				float avgDelBP = repeatFamilies.get(fm).getAvgDelBP();
				float minDelBP = repeatFamilies.get(fm).getMinDelBP();
				float maxDelBP = repeatFamilies.get(fm).getMaxDelBP();

				float avgInsBP = repeatFamilies.get(fm).getAvgInsBP();
				float minInsBP = repeatFamilies.get(fm).getMinInsBP();
				float maxInsBP = repeatFamilies.get(fm).getMaxInsBP();

				String roundAvgDelBP = String.format("%.2f", avgDelBP);
				String roundMinDelBP = String.format("%.2f", minDelBP);
				String roundMaxDelBP = String.format("%.2f", maxDelBP);

				String roundAvgInsBP = String.format("%.2f", avgInsBP);
				String roundMinInsBP = String.format("%.2f", minInsBP);
				String roundMaxInsBP = String.format("%.2f", maxInsBP);

				
				System.out.println(rc + "/" + fm + "\t"
					    + roundAvgDelBP + "\t" + roundMinDelBP + "\t" + roundMaxDelBP + "\t"
					    + roundAvgInsBP + "\t" + roundMinInsBP + "\t" + roundMaxInsBP + "\t");

			}
		}
	}
	
	public static void getSizePosition() {
		System.out.println("\n|Class/Family|\t|mean Size|\t|min. Size|\t|max Size|\t"
				+ "|%Comp. String|\t|mean Rel. Pos.|");
		
		for (String rc: repeatClasses.keySet()) {
			for (String fm: repeatClasses.get(rc).getFamilies()) {
				int meanSize = repeatFamilies.get(fm).getAvgSize();
				int minSize = repeatFamilies.get(fm).getAMinSize();
				int maxSize = repeatFamilies.get(fm).getAMaxSize();
				
				int totalComp = repeatFamilies.get(fm).getCountComp();
				int totalElements = repeatFamilies.get(fm).getElementIDs().size();
				float percComp = (float) totalComp / (float) totalElements;
				
				float meanRelPos = repeatFamilies.get(fm).getAvgRelPos();
				
				String roundMeanSize = Integer.toString(meanSize);
				String roundMinSize = Integer.toString(minSize);
				String roundMaxSize = Integer.toString(maxSize);
				
				String roundPercComp = String.format("%.2f", percComp);
				String roundMeanRelPos = String.format("%.3f",meanRelPos);
				
				System.out.println(rc + "/" + fm + "\t"
					    + roundMeanSize + "\t" + roundMinSize + "\t" + roundMaxSize + "\t"
					    + roundPercComp + "\t" + roundMeanRelPos );

			
			}
		}
	}
	
	public static void getDivergence() {
		float total = 0;
		float sum = 0;
		for (String elementID: collection.keySet()) {
			RMElement e = collection.get(elementID);
			sum += e.getSWScore();
			total++;
		}
	}
	
	public static void loadFile (String fileName) throws IOException{
				
		FileReader fr = new FileReader (fileName);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		line = br.readLine();
		line = br.readLine();
		line = br.readLine();
		
		while (line != null){
			//System.out.println("Processing: "+line);

			RMElement element = new RMElement();
			String[] fields = line.stripLeading().split("\\s+");
						
			//System.out.println("Processing element 0: "+fields[0]);
			element.setSWScore(Float.parseFloat(fields[0]));

			//System.out.println("Processing element 1: "+fields[1]);

			element.setDivPercent(Float.parseFloat(fields[1]));

			element.setDelBPPercent(Float.parseFloat(fields[2]));
			//System.out.println("Processing element 2: "+fields[2]);

			//System.out.println("Processing element 3: "+fields[3]);

			element.setInsBPPercent(Float.parseFloat(fields[3]));
			
			//System.out.println("Processing element 4: "+fields[4]);
			element.setQuerySeq(fields[4]); 
			
			//System.out.println("Processing element 5: "+fields[5]);
			element.setStartPosQuery(Integer.parseInt(fields[5]));
			
			//System.out.println("Processing element 6: "+fields[6]);
			element.setEndPosQuery(Integer.parseInt(fields[6]));
			
			//System.out.println("Processing element 7: "+fields[7]);
			String left = fields[7].replace("(", "").replace(")", "");
			element.setBasesAfterInQuery(Integer.parseInt(left));
			
			//System.out.println("Processing element 8: "+fields[8]);
			element.setIsComplement(fields[8].charAt(0));
			
			//System.out.println("Processing element 9: "+fields[9]);
			element.setRepeatName(fields[9]);
			
			//System.out.println("Processing element 10: "+fields[10]);
			element.setRepeatFamily(fields[10]);
			
			//System.out.println("Processing element 11: "+fields[11]);
			String some = fields[11].replace("(", "").replace(")", "");

			element.setBasesPriorCons(Integer.parseInt(some));
			
			//System.out.println("Processing element: "+fields[12]);

			element.setStartPosCons(Integer.parseInt(fields[12]));
			
			String endPosCons = fields[13].replaceAll("[()]", "");
			//System.out.println("Processing element: "+endPosCons);
			
			element.setEndPosCons(Integer.parseInt(endPosCons));
	        int elementID = Integer.parseInt(fields[14]);
	        element.setUniqueID(elementID);
	        String codigo = fields[14]+":"+fields[5];
			collection.put(codigo, element);
			String subclass = fields[10];
			
	      	String className = subclass;
        	String familyName = subclass;
        	
	        if(subclass.contains("/")) {
	        	String[] parts = subclass.split("/");
		        className = parts[0];
		        familyName = parts[1];
	        } 
			        
	        if (!repeatClasses.containsKey(className)) {
	        	repeatClass currentClass = new repeatClass();
	        	currentClass.setName(className);
	        	repeatClasses.put(className, currentClass);
	        }
	        
			if (!repeatFamilies.containsKey(familyName)) {
				repeatFamily family = new repeatFamily();
				family.setFamilyName(familyName);
				repeatFamilies.put(familyName, family);
			}
			
			repeatClasses.get(className).addFamily(familyName);
			repeatFamilies.get(familyName).addElement(codigo);
			updateFamilyValues(familyName, codigo);
			line = br.readLine();
			
		}
	}
	
	public static void updateFamilyValues(String familyName, String codigo) {
		
		float SWScore = collection.get(codigo).getSWScore();
		repeatFamilies.get(familyName).updateAvgSWScore(SWScore);
		
		float divPercent = collection.get(codigo).getDivPercent();
		repeatFamilies.get(familyName).updateAvgDivPerc(divPercent);
		
		float delBP = collection.get(codigo).getDelBPPercent();
		repeatFamilies.get(familyName).updateDelBP(delBP);
		
		float insBP = collection.get(codigo).getInsBPPercent();
		repeatFamilies.get(familyName).updateInsBP(insBP);
		
		//Calculado con la query sequence
		int size = collection.get(codigo).getEndPosQuery() - collection.get(codigo).getStartPosQuery();
		repeatFamilies.get(familyName).updateSize(size);
		
		int endPos = collection.get(codigo).getEndPosQuery();
		int startPos = collection.get(codigo).getStartPosQuery();
		int medianPos = ((endPos-startPos)/2)+startPos;
		int basesLeft = collection.get(codigo).getBasesAfterInQuery();
		int  totalLength = endPos+basesLeft;
		float relPos = (float)medianPos/(float)totalLength;
		repeatFamilies.get(familyName).updateRelPos(relPos);
				
		char comp = collection.get(codigo).getIsComplement();
		if (comp == 'C') {
			repeatFamilies.get(familyName).updateComp(1);
		} 
	}
	
	public static void main(String[] args) throws IOException{
		String fileName = args[0];
		loadFile(fileName);
		getSWScoreAverage();
		getGrossCounts();
		getAvgScoresSWDiv();
		getAvgScoresDelIns();
		getSizePosition();
		
	}
}


