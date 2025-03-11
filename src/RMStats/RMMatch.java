package RMStats;

public class RMMatch {
	private float SWScore;
	private float divPercent;
	private float delBPPercent;
	private float insBPPercent;
	private String querySeq;
	private int startPosQuery;
	private int endPosQuery;
	private int basesAfterInQuery;
	private char isComplement;
	private String repeatName;
	private String repeatFamily;
	private int basesPriorCons;
	private int startPosCons;
	private int endPosCons;
	private int uniqueID;
	
	public RMMatch() {
		
	}
	
	public void setSWScore(float SWScore) {
	    this.SWScore = SWScore;
	}

	public void setDivPercent(float divPercent) {
	    this.divPercent = divPercent;
	}

	public void setDelBPPercent(float delBPPercent) {
	    this.delBPPercent = delBPPercent;
	}

	public void setInsBPPercent(float insBPPercent) {
	    this.insBPPercent = insBPPercent;
	}

	public void setQuerySeq(String querySeq) {
	    this.querySeq = querySeq;
	}

	public void setStartPosQuery(int startPosQuery) {
	    this.startPosQuery = startPosQuery;
	}

	public void setEndPosQuery(int endPosQuery) {
	    this.endPosQuery = endPosQuery;
	}

	public void setBasesAfterInQuery(int basesAfterInQuery) {
	    this.basesAfterInQuery = basesAfterInQuery;
	}

	public void setIsComplement(char isComplement) {
	    this.isComplement = isComplement;
	}

	public void setRepeatName(String repeatName) {
	    this.repeatName = repeatName;
	}

	public void setRepeatFamily(String repeatSubClass) {
	    this.repeatFamily = repeatSubClass;
	}

	public void setBasesPriorCons(int basesPriorCons) {
	    this.basesPriorCons = basesPriorCons;
	}

	public void setStartPosCons(int startPosCons) {
	    this.startPosCons = startPosCons;
	}
	
	public void setEndPosCons(int endPosCons) {
		this.endPosCons = endPosCons;
	}

	public void setUniqueID(int uniqueID) {
	    this.uniqueID = uniqueID;
	}

	public float getSWScore() {
	    return SWScore;
	}
	
	public int getEndPosCons() {
		return endPosCons;
	}

	public float getDivPercent() {
	    return divPercent;
	}

	public float getDelBPPercent() {
	    return delBPPercent;
	}

	public float getInsBPPercent() {
	    return insBPPercent;
	}

	public String getQuerySeq() {
	    return querySeq;
	}

	public int getStartPosQuery() {
	    return startPosQuery;
	}

	public int getEndPosQuery() {
	    return endPosQuery;
	}

	public int getBasesAfterInQuery() {
	    return basesAfterInQuery;
	}

	public char getIsComplement() {
	    return isComplement;
	}

	public String getRepeatName() {
	    return repeatName;
	}

	public String getRepeatSubClass() {
	    return repeatFamily;
	}

	public int getBasesPriorCons() {
	    return basesPriorCons;
	}

	public int getStartPosCons() {
	    return startPosCons;
	}

	public int getUniqueID() {
	    return uniqueID;
	}

}
