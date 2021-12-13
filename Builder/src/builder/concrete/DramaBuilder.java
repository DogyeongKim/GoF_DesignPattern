package builder.concrete;

import builder.TVshowBuilder;

public class DramaBuilder extends TVshowBuilder{

	@Override
	public TVshowBuilder buildName() {
		tvShow.setName("Drama");
		return this;
	}

	@Override
	public TVshowBuilder buildChannel() {
		tvShow.setChannel("MBC");
		return this;
	}

	@Override
	public TVshowBuilder buildDayOfWeek() {
		tvShow.setDayOfWeek("Wednesday");
		return this;
	}

}
