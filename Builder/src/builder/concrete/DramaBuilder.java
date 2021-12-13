package builder.concrete;

import builder.TvShowBuilder;

public class DramaBuilder extends TvShowBuilder{

	@Override
	public TvShowBuilder buildName() {
		tvShow.setName("Drama");
		return this;
	}

	@Override
	public TvShowBuilder buildChannel() {
		tvShow.setChannel("MBC");
		return this;
	}

	@Override
	public TvShowBuilder buildDayOfWeek() {
		tvShow.setDayOfWeek("Monday");
		return this;
	}

}
