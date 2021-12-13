package builder;

import product.TvShow;

public abstract class TvShowBuilder {
	
	protected TvShow tvShow;
	
	public TvShow getTvShow() {
		return tvShow;
	}
	
	public TvShowBuilder create() {
		tvShow = new TvShow();
		return this;
	}
	
	public abstract TvShowBuilder buildName();
	public abstract TvShowBuilder buildChannel();
	public abstract TvShowBuilder buildDayOfWeek();

}
