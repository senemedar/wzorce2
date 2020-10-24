package behavioral.strategy;

//TODO należy wykorzystać tę klasę - wyświetlanie normalnego ekranu
public class RenderScreenStrategy implements RenderStrategy {
	public void render() {
		System.out.println("Teraz wyświetlamy IntelliJ z naszym projektem (praca normalna)");
	}
}
