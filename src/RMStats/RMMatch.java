package RMStats;

public class RMMatch {
	private float SWScore;
	private float divPercent;
	private float delBPPercent;
	private float insBPPercent;
	private String querySeq;
	private long startPosQuery;
	private long endPosQuery;
	private long basesAfterInQuery;
	private char isComplement;
	private String repeatName;
	private String repeatFamily;
	private long basesPriorCons;
	private long startPosCons;
	private long endPosCons;
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

	public void setStartPosQuery(long l) {
	    this.startPosQuery = l;
	}

	public void setEndPosQuery(long endPosQuery) {
	    this.endPosQuery = endPosQuery;
	}

	public void setBasesAfterInQuery(long basesAfterInQuery) {
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

	public void setBasesPriorCons(long basesPriorCons) {
	    this.basesPriorCons = basesPriorCons;
	}

	public void setStartPosCons(long startPosCons) {
	    this.startPosCons = startPosCons;
	}
	
	public void setEndPosCons(long endPosCons) {
		this.endPosCons = endPosCons;
	}

	public void setUniqueID(int uniqueID) {
	    this.uniqueID = uniqueID;
	}

	public float getSWScore() {
	    return SWScore;
	}
	
	public long getEndPosCons() {
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

	public long getStartPosQuery() {
	    return startPosQuery;
	}

	public long getEndPosQuery() {
	    return endPosQuery;
	}

	public long getBasesAfterInQuery() {
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

	public long getBasesPriorCons() {
	    return basesPriorCons;
	}

	public long getStartPosCons() {
	    return startPosCons;
	}

	public int getUniqueID() {
	    return uniqueID;
	}

}
