package product;

public class TvShow {
	
	private String name;
	private String channel;
	private String dayOfWeek;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	@Override
	public String toString() {
		return "<" + name + ">\n" +
				"channel = " + channel + "\n" +
				"day of the week = " + dayOfWeek + "\n";
	}

}
