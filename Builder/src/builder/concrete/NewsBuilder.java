package builder.concrete;

import builder.TVshowBuilder;

public class NewsBuilder extends TVshowBuilder{

	@Override
	public TVshowBuilder buildName() {
		tvShow.setName("SBS News");
		return this;
	}

	@Override
	public TVshowBuilder buildChannel() {
		tvShow.setChannel("SBS");
		return this;
	}

	@Override
	public TVshowBuilder buildDayOfWeek() {
		tvShow.setDayOfWeek("Friday");
		return this;
	}

}
