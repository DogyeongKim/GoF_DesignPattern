package director;

import builder.TVshowBuilder;
import product.TVshow;

public class Director {

	private TVshowBuilder tvShowBuilder;
	
	public void setTVshowBuilder(TVshowBuilder tvShowBuilder) {
		this.tvShowBuilder = tvShowBuilder;
	}
	
	public TVshow constructTVshow() {
		return tvShowBuilder.create()
				.buildName()
				.buildChannel()
				.buildDayOfWeek()
				.getTVshow();
	}
}
