package director;

import builder.TvShowBuilder;
import product.TvShow;

public class Director {

	private TvShowBuilder tvShowBuilder;
	
	public void setTvShowBuilder(TvShowBuilder tvShowBuilder) {
		this.tvShowBuilder = tvShowBuilder;
	}
	
	public TvShow constructTvShow() {
		return tvShowBuilder.create()
				.buildName()
				.buildChannel()
				.buildDayOfWeek()
				.getTvShow();
	}
}
