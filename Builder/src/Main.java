import builder.concrete.DramaBuilder;
import builder.concrete.NewsBuilder;
import director.Director;
import product.TVshow;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		
		DramaBuilder dramaBuilder = new DramaBuilder();
		NewsBuilder newsBuilder = new NewsBuilder();
		
//		director.setTVshowBuilder(dramaBuilder);
		director.setTVshowBuilder(newsBuilder);
		
		
		TVshow tvShow = director.constructTVshow();
		
		System.out.println(tvShow);

	}

}
