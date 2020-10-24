package behavioral.strategy;
//TODO należy wykorzystać tę klasę - wyświetlanie wygaszacza
public class RenderScreenSaverStrategy implements RenderStrategy {
	public void render() {
		System.out.println("Teraz wyświetlają się latające wehikuły, bo taki mamy wygaszacz ekranu");
	}
}
