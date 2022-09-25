
public class AdaptadorJamon implements Baguette{
	PizzaJamon pizza;
	
	public AdaptadorJamon(PizzaJamon pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescripcion() {
		return "Deliciosa pizza de " + pizza.getCarne() +
				" con queso " + pizza.getQueso() +
				" y una crujiente " + pizza.getMasa() +
				" por el sorprendente precio de " + pizza.getPrecio() + " pesos.";

	}

	@Override
	public int getPollo() {
		return 0;
	}

	@Override
	public int getPepperoni() {
		return 0;
	}

	@Override
	public int getJamon() {
		return 0;
	}

	@Override
	public int getLechuga() {
		return 0;
	}

	@Override
	public int getJitomate() {
		return 0;
	}

	@Override
	public int getCebolla() {
		return 0;
	}

	@Override
	public int getMostaza() {
		return 0;
	}

	@Override
	public int getCatsup() {
		return 0;
	}

	@Override
	public int getMayonesa() {
		return 0;
	}

	@Override
	public int getPrecio() {
		return pizza.getPrecio();
	}
	
}
	