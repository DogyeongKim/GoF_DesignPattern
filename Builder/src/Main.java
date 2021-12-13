import builder.TvShowBuilder;
import builder.concrete.DramaBuilder;
import builder.concrete.NewsBuilder;
import director.Director;
import product.TvShow;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		
		DramaBuilder dramaBuilder = new DramaBuilder();
		NewsBuilder newsBuilder = new NewsBuilder();
		
//		director.setTvShowBuilder(dramaBuilder);
		director.setTvShowBuilder(newsBuilder);
		
		TvShow tvShow = director.constructTvShow();
		
		System.out.println(tvShow);

	}

}
