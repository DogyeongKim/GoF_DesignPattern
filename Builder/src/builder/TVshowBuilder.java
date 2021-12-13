package builder;

import product.TVshow;

public abstract class TVshowBuilder {
	
	protected TVshow tvShow;
	
	public TVshow getTVshow() {
		return tvShow;
	}
	
	public TVshowBuilder create() {
		tvShow = new TVshow();
		return this;
	}
	
	public abstract TVshowBuilder buildName();
	public abstract TVshowBuilder buildChannel();
	public abstract TVshowBuilder buildDayOfWeek();
}
