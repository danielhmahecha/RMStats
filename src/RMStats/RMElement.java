package RMStats;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class RMElement {
	private int uniqueID;
	private HashSet<RMMatch> matches = new HashSet<>();
	private List<long[]> intervals = new ArrayList<>();
	private int size;
	
	public RMElement() {
		
	}
	public void setUniqueID (int uniqueID) {
		this.uniqueID=uniqueID;
	}
	
	public int getID() {
		return this.uniqueID;
	}
	
	public HashSet<RMMatch> getMatches(){
		return this.matches;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void addMatch(RMMatch match) {
		matches.add(match);
		intervals.add(new long[] {match.getStartPosQuery(),match.getEndPosQuery()});
	}
	
	public void mergeIntervals() {
		intervals.sort(Comparator.comparingLong(a -> a[0]));
		int totalLength = 0;
		long[] previous = intervals.get(0);
		for (int i=1; i<intervals.size();i++) {
			long[] current = intervals.get(i);
			if (current[0] > previous[1]) {
				totalLength += (previous[1]-previous[0]+1);
				previous = current;
			}else {
				previous[1] = Math.max(previous[1], current[1]);
			}
		}
		
		totalLength += (previous[1] - previous[0] +1);
		size = totalLength;
	}
}
