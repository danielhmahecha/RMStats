package RMStats;

import java.util.HashSet;

public class repeatFamily {
	private String familyName;
	private HashSet<String> elementIDs = new HashSet<>();
	
	private float avgSWScore=0;
	private float maxSWScore=0;
	private float minSWScore= Float.MAX_VALUE;
	
	private float avgDivPerc=0;
	private float maxDivPerc=0;
	private float minDivPerc=Float.MAX_VALUE;
	
	private float avgDelBP=0;
	private float maxDelBP=0;
	private float minDelBP=Float.MAX_VALUE;
	
	private float avgInsBP=0;
	private float maxInsBP=0;
	private float minInsBP=Float.MAX_VALUE;


	public repeatFamily() {
		
	}
	
	public void setFamilyName(String subclassName){
		this.familyName = subclassName;
	}
	 
	public String getFamilyName() {
		return this.familyName;
	}
	
	public HashSet<String> getElementIDs(){
		return this.elementIDs;
	}
	
	public void addElement(String elementID) {
		elementIDs.add(elementID);
	}
	
	public void updateAvgSWScore(float newVal) {
		int previousElementCount = elementIDs.size()-1;
		avgSWScore = ((avgSWScore*previousElementCount) + newVal )/ ((float) elementIDs.size());
		if (newVal<minSWScore) minSWScore = newVal;
		if (newVal>maxSWScore) maxSWScore = newVal;
	}
	
	public void updateAvgDivPerc(float newVal) {
		int previousElementCount = elementIDs.size()-1;
		avgDivPerc = ((avgDivPerc*previousElementCount) + newVal) / (float) elementIDs.size();
		if (newVal<minDivPerc) minDivPerc=newVal;
		if (newVal>maxDivPerc) maxDivPerc=newVal;
	}
	
	public void updateDelBP(float newVal) {
		int previousElementCount = elementIDs.size()-1;
		avgDelBP = ((avgDelBP*previousElementCount) + newVal )/ (float) elementIDs.size();
		if (newVal<minDelBP) minDelBP=newVal;
		if (newVal>maxDelBP) maxDelBP=newVal;
	}
	
	public void updateInsBP(float newVal) {
		int previousElementCount = elementIDs.size()-1;
		avgInsBP = ((avgInsBP*previousElementCount) + newVal )/ (float) elementIDs.size();
		if (newVal<minInsBP) minInsBP=newVal;
		if (newVal>maxInsBP) maxInsBP=newVal;
	}
	
	public float getAvgSWScore() {
	    return avgSWScore;
	}

	public float getMaxSWScore() {
	    return maxSWScore;
	}

	public float getMinSWScore() {
	    return minSWScore;
	}

	public float getAvgDivPerc() {
	    return avgDivPerc;
	}

	public float getMaxDivPerc() {
	    return maxDivPerc;
	}

	public float getMinDivPerc() {
	    return minDivPerc;
	}

	public float getAvgDelBP() {
	    return avgDelBP;
	}

	public float getMaxDelBP() {
	    return maxDelBP;
	}

	public float getMinDelBP() {
	    return minDelBP;
	}

	public float getAvgInsBP() {
	    return avgInsBP;
	}

	public float getMaxInsBP() {
	    return maxInsBP;
	}

	public float getMinInsBP() {
	    return minInsBP;
	}

}
