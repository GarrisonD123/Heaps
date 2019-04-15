
public class ComparableMovie extends Movie implements Comparable<ComparableMovie>{
private double priority;
public ComparableMovie(Movie aMovie, MovieWatcher aWatcher) {
	super(aMovie.getName(), aMovie.getRating(), aMovie.getTags());
	calculatePriority(aWatcher);
}

private void calculatePriority(MovieWatcher aWatcher) {
	for(MovieTag tag: super.getTags()) {
	 priority += (aWatcher.getCountFor(tag) * super.getRating());
	   }
	}
public double getPriority() {
	return this.priority;
}
public String toString() {
	return super.toString() +" Priority: "+ this.priority;
}
public int compareTo(ComparableMovie m) {
	if(this.priority< m.getPriority())
		return -1;
	else if(this.priority> m.getPriority())
		return 1;
	else 
		return 0;
}
}
