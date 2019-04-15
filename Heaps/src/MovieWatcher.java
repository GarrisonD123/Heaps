
public class MovieWatcher {
	private double[] tagsWatched;
	
	public MovieWatcher() {
		tagsWatched = new double[MovieTag.values().length];
	}

	public double[] getTagsWatched() {
		return tagsWatched;
	}

	public void setTagsWatched(double[] tagsWatched) {
		this.tagsWatched = tagsWatched;
	}
	public double getCountFor(MovieTag tag) {
		int index = MovieTag.tagToIndex(tag);
		if(index == -1)
			return -1;
		return tagsWatched[index];
	}
	public String toString() {
		String ret = " ";
		for(int i = 0; i<tagsWatched.length;i++) {
			ret += (MovieTag.values()[i] + " " + tagsWatched[i] + "\n");
		}
		return ret;
		}
	}

