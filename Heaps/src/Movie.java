import java.util.*;
public class Movie {
	private String name;
	private int rating; //1-5
	private LinkedList <MovieTag> tags;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
	if(rating >=1 && rating<=5)	
		this.rating = rating;
	else
		this.rating = 1;
	}
	public LinkedList<MovieTag> getTags() {
		return tags;
	}
	public void setTags(LinkedList<MovieTag> tags) {
		this.tags = tags;
	}
	public Movie(String n, int r, LinkedList<MovieTag> t) {
		this.setName(n);
		this.setRating(r);
		this.setTags(t);
	}
	public String toString() {
		String ret = "Name: " + this.name +" Rating: "+ this.rating + "Tags: ";
		for(MovieTag tag: tags)
			ret += (tag + " ");
		return ret;
	}
}
