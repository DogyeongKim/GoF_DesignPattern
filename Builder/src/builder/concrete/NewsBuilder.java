package builder.concrete;

import builder.TvShowBuilder;

public class NewsBuilder extends TvShowBuilder{

	@Override
	public TvShowBuilder buildName() {
		tvShow.setName("News");
		return this;
	}

	@Override
	public TvShowBuilder buildChannel() {
		tvShow.setChannel("SBS");
		return this;
	}

	@Override
	public TvShowBuilder buildDayOfWeek() {
		tvShow.setDayOfWeek("Friday");
		return this;
	}
}
