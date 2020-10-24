package behavioral.strategy;

//TODO należy wykorzystać tę klasę - nie wyświetla niczego (możesz zrobić odpowiedniego souta :) )
public class RenderNothingStrategy implements RenderStrategy {
	public void render() {
		System.out.println("Ekran nieaktywny");
	}
}
